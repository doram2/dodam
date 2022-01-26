package kosaShoppingMall.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import kosaShoppingMall.command.EmployeeCommand;
import kosaShoppingMall.domain.EmployeeDTO;
import kosaShoppingMall.mappers.EmployeeMapper;

@Component
@Service
public class EmployeeUpdateService {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	PasswordEncoder passwordEncoder;
	public void execute(EmployeeCommand employeeCommand, Model model) {
		
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmpId(employeeCommand.getEmpId());
		dto.setEmpName(employeeCommand.getEmpName());
		dto.setEmpPhone(employeeCommand.getEmpPhone());
		dto.setEmpPw(employeeCommand.getEmpPw());
		dto.setEmpAddr(employeeCommand.getEmpAddr());
	
		 
		employeeMapper.empUpdate(dto);
	}
}
