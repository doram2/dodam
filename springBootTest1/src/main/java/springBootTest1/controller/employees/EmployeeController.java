package springBootTest1.controller.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springBootTest1.command.EmployeeCommand;
import springBootTest1.service.employees.EmployeeWriteService;

@Controller
@RequestMapping("emp") // 맨 앞 중복 주소 고정
public class EmployeeController {
	@Autowired
	EmployeeWriteService employeeWriteService;

	@RequestMapping("employeesList")
	public String empList() {
		return "thymeleaf/employees/empList";
	}

	@RequestMapping("employeesForm")
	public String empForm() {
		return "thymeleaf/employees/empForm";
	}

	@RequestMapping("employeeWrite")
	public String empWrite(EmployeeCommand employeeCommand, Model model) {
		String path = employeeWriteService.execute(employeeCommand, model);
		return path;
	}
}