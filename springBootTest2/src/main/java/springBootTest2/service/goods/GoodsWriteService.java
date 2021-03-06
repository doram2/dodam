package springBootTest2.service.goods;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import springBootTest2.command.GoodsCommand;
import springBootTest2.domain.AuthInfo;
import springBootTest2.domain.GoodsDTO;
import springBootTest2.mapper.Goods1Mapper;

@Component
@Service
public class GoodsWriteService {
	
	@Autowired 
	Goods1Mapper goods1Mapper;
	

	public void execute(GoodsCommand goodsCommand, HttpSession session, HttpServletRequest request) {
		GoodsDTO dto = new GoodsDTO();
		dto.setGoodsNum(goodsCommand.getGoodsNum());
		dto.setGoodsName(goodsCommand.getGoodsName());
		dto.setGoodsPrice(goodsCommand.getGoodsPrice());
		dto.setGoodsDate(goodsCommand.getGoodsDate());
		dto.setGoodsContent(goodsCommand.getGoodsContent());
		dto.setGoodsQty(goodsCommand.getGoodsQty());
		dto.setGoodsCompany(goodsCommand.getGoodsCompany());
		dto.setEmpNum(goodsCommand.getEmpNum());
		
		
		String goodsImageTotal = "";
		String fileDir = "/view/goods";
		String filePath = request.getServletContext().getRealPath(fileDir);
		
		//if(!goodsCommand.getGoodsImage()[0].getOriginalFilename().isEmpty()) {
		for(MultipartFile mf : goodsCommand.getGoodsImage()) {//배열로 받아온걸 하나씩 가져옴 
			String originalFile = mf.getOriginalFilename(); //MultipartFile은 이름 변경 정책이 없음
			String extension = originalFile.substring( //확장자만 가져옴
					originalFile.lastIndexOf("."));
			String storeName = UUID.randomUUID().toString().replace("-", ""); //이름만 가져옴
			String storeFileName = storeName + extension; //이름 + 확장자 String fileSize =
			//Long.toString(mf.getSize());
			File file = new File(filePath + "/" + storeFileName);
		
			try {
				mf.transferTo(file);
			} catch (Exception e) {e.printStackTrace();}
			
			goodsImageTotal += storeFileName+"`";
			}
		//}
		dto.setGoodsImage(goodsImageTotal);
		/*
		 * dto.setStoreFileName(storeTotal); dto.setFileSize(fileSizeTotal);
		 */
		 
		Integer i = goods1Mapper.goodsInsert(dto);
		System.out.println(i + "개 행이(가) 삽입되었습니다.");
	}
}
