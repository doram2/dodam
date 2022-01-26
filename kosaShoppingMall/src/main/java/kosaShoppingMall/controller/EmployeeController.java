package kosaShoppingMall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kosaShoppingMall.command.EmployeeCommand;
import kosaShoppingMall.service.employee.EmployeeDeleteService;
import kosaShoppingMall.service.employee.EmployeeInfoService;
import kosaShoppingMall.service.employee.EmployeeListService;
import kosaShoppingMall.service.employee.EmployeeModifyService;
import kosaShoppingMall.service.employee.EmployeeUpdateService;
import kosaShoppingMall.service.employee.EmployeeWriteService;
import kosaShoppingMall.service.employee.PwConfirmService;

@Controller
@RequestMapping("emp")

public class EmployeeController {
	@Autowired
	EmployeeWriteService employeeWriteService;
	@Autowired
	EmployeeListService employeeListService;
	@Autowired
	EmployeeInfoService employeeInfoService;
	@Autowired
	EmployeeUpdateService employeeUpdateService;
	@Autowired
	EmployeeDeleteService employeeDeleteService;
	@Autowired
	EmployeeModifyService employeeModifyService;
	
	
	@RequestMapping("empUpdate")
	public String empUpdate(EmployeeCommand employeeCommand, Model model) {
		employeeUpdateService.execute(employeeCommand, model);
		return "redirect:empInfo?id=" + employeeCommand.getEmpId();
	}
	
	@RequestMapping("empModify")
	public String empModify(@RequestParam(value = "id") String empId, @RequestParam(value="empPw") String empPw, Model model) {
		String path = employeeModifyService.execute(empId, empPw, model);
		return path;		
	}
	
	@RequestMapping("empDelete")
	public String empDelete(@RequestParam(value = "id") String empId, @RequestParam(value="empPw") String empPw, Model model) {
			employeeDeleteService.execute(empId);
			return "redirect:empList";
	}
	
	@RequestMapping("empInfo")
	public String empInfo(@RequestParam(value="id") String empId, Model model) {
		employeeInfoService.execute(empId, model);
		return "thymeleaf/employee/empDetail";
	}
	
	@RequestMapping("empList")
	public String empList(Model model) {
		employeeListService.execute(model);
		return "thymeleaf/employee/empList";
	}
	
	@RequestMapping("empJoin")
	public String empJoin() {
		return "thymeleaf/employee/empForm";
	}
	
	@RequestMapping("empWrite")
	public String empWrite(EmployeeCommand employeeCommand) {
		if(!employeeCommand.IsEmpPwEqualsEmpPwCon()) {//비밀번호와 비밀번호 확인이 다르면
			return "thymeleaf/employee/empForm";
			//에러처리 나중에한대
		}
		employeeWriteService.execute(employeeCommand);
		return "redirect:empList";
	}
}
