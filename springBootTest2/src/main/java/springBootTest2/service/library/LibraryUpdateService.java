package springBootTest2.service.library;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.html.HTMLModElement;

import springBootTest2.command.LibraryCommand;
import springBootTest2.domain.AuthInfo;
import springBootTest2.domain.LibraryDTO;
import springBootTest2.mapper.LibraryMapper;

@Component
@Service
public class LibraryUpdateService {
	@Autowired
	LibraryMapper libraryMapper;

	public String execute(LibraryCommand libraryCommand, HttpSession session, Model model) {
		String path = "redirect:libInfo?num=" + libraryCommand.getLibNum();
		AuthInfo authInfo = (AuthInfo) session.getAttribute("authInfo");
		LibraryDTO dto = libraryMapper.selectOne(libraryCommand.getLibNum());
		
		String[] fileNames = null;
		if(dto.getStoreFileName() != null) {
			fileNames = dto.getStoreFileName().split("`");
		}
		
		String filePath = "/view/lib";
		String fileDir = session.getServletContext().getRealPath(filePath);
		
		String originalTotal = "";
		String storeTotal = "";
		String fileSizeTotal = "";
		
		if (!dto.getLibPw().equals(libraryCommand.getLibPw()) || !dto.getMemId().equals(authInfo.getUserId())) {
			model.addAttribute("dto", libraryCommand);
			model.addAttribute("err_pw", "비밀번호가 틀리거나 게시글 작성자가 아닙니다.");
			path = "thymeleaf/lib/libModify";
		}else {
			dto.setLibContent(libraryCommand.getLibContent());
			dto.setLibNum(Integer.parseInt(libraryCommand.getLibNum()));
			dto.setLibSubject(libraryCommand.getLibSubject());
			dto.setLibWriter(libraryCommand.getLibWriter());
			if(dto.getOriginalFileName() != null) {
				originalTotal = dto.getOriginalFileName();
				storeTotal = dto.getStoreFileName();
				fileSizeTotal = dto.getFileSize();
			}

			///////////////////////여기서부터
			if (!libraryCommand.getReport()[0].getOriginalFilename().isEmpty()) {
				originalTotal = "";
				storeTotal = "";
				fileSizeTotal = "";
				for (MultipartFile mf : libraryCommand.getReport()) {
					String originalFile = mf.getOriginalFilename();
					String extension = originalFile.substring(originalFile.lastIndexOf(".")); // 마지막 . 이 있는 index부터 가져온
					String storeName = UUID.randomUUID().toString().replace("-", "");
					String storeFileName = storeName + extension;
					String fileSize = Long.toString(mf.getSize());

					File file = null;
					file = new File(fileDir + "/" + storeFileName);
					try {
						mf.transferTo(file);
					} catch (Exception e) {
					}
					originalTotal += originalFile + "`";
					storeTotal += storeFileName + "`";
					fileSizeTotal += fileSize + "`";
				}
			}
			////////////////////////////여기까지 
			//파일이 등록되어 있을때만 실행 -> 파일 이름, 크기 받아와서 주르륵 수정
			
			
			dto.setFileSize(fileSizeTotal);
			dto.setOriginalFileName(originalTotal);
			dto.setStoreFileName(storeTotal);
			Integer i = libraryMapper.libraryUpdate(dto);
			// 파일삭제
			if (i > 0) {
				File file = null;
				try {
					for (String fileName : fileNames) {
						file = new File(fileDir + "/" + fileName);
						if (file.exists()) file.delete();
					}
				} catch (Exception e) {}
			}
		}
		return path;
	}
}