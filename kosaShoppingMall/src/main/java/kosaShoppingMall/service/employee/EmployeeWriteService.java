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
public class EmployeeWriteService {
	@Autowired
	PasswordEncoder passwordEncoder; //패스워드 암호화 작업을 위해 가져옴
	@Autowired
	EmployeeMapper employeeMapper;
	
	public void execute(EmployeeCommand employeeCommand) {
		String empPw = passwordEncoder.encode(employeeCommand.getEmpPw());
		System.out.println(empPw);
		EmployeeDTO dto  = new EmployeeDTO();
		dto.setEmpId(employeeCommand.getEmpId());
		dto.setEmpName(employeeCommand.getEmpName());
		dto.setEmpPw(empPw); //암호화했으니까 command에서 가져오지말고 이거넣어줌
		dto.setEmpAddr(employeeCommand.getEmpAddr());
		dto.setEmpPhone(employeeCommand.getEmpPhone());
	
		employeeMapper.empInsert(dto);
	}
}
