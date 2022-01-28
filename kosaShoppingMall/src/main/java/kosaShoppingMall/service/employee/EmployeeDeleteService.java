package kosaShoppingMall.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import kosaShoppingMall.domain.EmployeeDTO;
import kosaShoppingMall.mappers.EmployeeMapper;
@Component
@Service

public class EmployeeDeleteService {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	PasswordEncoder passwordEncoder;
	public String execute(String empId, String empPw, Model model) {
		String path = "thymeleaf/employee/empList";
		EmployeeDTO dto = employeeMapper.selectOne(empId);
		Integer i = 0;
		if(passwordEncoder.matches(empPw, dto.getEmpPw())) {
			i = employeeMapper.empDelete(empId);
			path = "redirect:empList";
		} else { 
			model.addAttribute("errPw","비밀번호가 일치하지 않습니다.");
			model.addAttribute("employeeCommand", dto);
			path = "thymeleaf/employee/empDetail";
		}
		model.addAttribute("empId",i);
		return path;
	}
}