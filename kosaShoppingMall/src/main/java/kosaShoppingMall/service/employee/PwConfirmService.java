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
public class PwConfirmService {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public boolean execute(String empId, String empPw, Model model) {
		EmployeeDTO dto = employeeMapper.selectOne(empId);
		if(passwordEncoder.matches(empPw, dto.getEmpPw())){
			return true;
		}
		else {
			model.addAttribute("errPw", "비밀번호가 일치하지 않습니다.");
			return false;
		}
	}
}
