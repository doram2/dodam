package springBootTest2.service.emplib;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootTest2.command.EmpLibCommand;
import springBootTest2.domain.AuthInfo;
import springBootTest2.domain.EmpLibDTO;
import springBootTest2.mapper.EmpLibMapper;
import springBootTest2.mapper.EmployeeMapper;

@Component
@Service
public class EmpLibDeleteService {
	@Autowired
	EmpLibMapper emplibMapper;
	@Autowired
	EmployeeMapper empMapper;

	public String execute(EmpLibCommand empLibCommand, Model model, HttpSession session) {
		String path = "thymeleaf/emplib/emplibList";
		AuthInfo authInfo = (AuthInfo) session.getAttribute("authInfo");
		String empId = authInfo.getUserId();
		Integer empNum = empMapper.getEmpNum(empId);
		model.addAttribute("empNum", empNum);
		EmpLibDTO dto = emplibMapper.selectOne(empLibCommand.getLibNum());
		model.addAttribute("dto", dto);
		if(!dto.getLibPw().equals(empLibCommand.getLibPw()) || 
				!dto.getEmpNum().equals(empNum)) {
			model.addAttribute("err_pw","비밀번호가 틀리거나 작성자가 아닙니다.");
			path = "thymeleaf/emplib/emplibInfo";
		}else {
			Integer i = emplibMapper.emplibDelete(empLibCommand.getLibNum());
			if(i > 0 && dto.getStoreFileName() != null) {
			String storeFileNames[] = dto.getStoreFileName().split("`");
			String fileDir = session.getServletContext().getRealPath("/view/emplib");
			for(String fileName : storeFileNames) {
				File file = new File(fileDir + "/" +fileName);
				if(file.exists())file.delete();
				}
			}
			path = "thymeleaf/emplib/emplibList";
		}
		return path;
	}
}