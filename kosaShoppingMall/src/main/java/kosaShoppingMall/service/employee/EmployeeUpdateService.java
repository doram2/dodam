package kosaShoppingMall.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
	public void execute(EmployeeCommand employeeCommand) {
		String empPw = passwordEncoder.encode(employeeCommand.getEmpPw());
		
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmpId(employeeCommand.getEmpId());
		dto.setEmpName(employeeCommand.getEmpName());
		dto.setEmpPhone(employeeCommand.getEmpPhone());
		dto.setEmpPw(empPw);
		dto.setEmpAddr(employeeCommand.getEmpAddr());
	
		 
		employeeMapper.empUpdate(dto);
	}
}