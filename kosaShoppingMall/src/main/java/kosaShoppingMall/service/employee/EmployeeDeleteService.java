package kosaShoppingMall.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import kosaShoppingMall.mappers.EmployeeMapper;
@Component
@Service

public class EmployeeDeleteService {
	@Autowired
	EmployeeMapper employeeMapper;
	public void execute(String empId) {
		employeeMapper.empDelete(empId);
	}
}
