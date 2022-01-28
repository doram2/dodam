package kosaShoppingMall.controller;

import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@ModelAttribute
	EmployeeCommand setEmployeeCommand() {
		return new EmployeeCommand();
	}
	
	@RequestMapping(value = "empUpdate", method = RequestMethod.POST)
	public String empUpdate(EmployeeCommand employeeCommand) {
		employeeUpdateService.execute(employeeCommand);
		return "redirect:empInfo?id=" + employeeCommand.getEmpId();
	}
	
	@RequestMapping("empModify")
	public String empModify(@RequestParam(value = "empId") String empId, @RequestParam(value="empPw") String empPw, Model model) {
		String path = employeeModifyService.execute(empId, empPw, model);
		return path;		
	}
	
	@RequestMapping(value="empDelete", method = RequestMethod.POST)
	public String empDelete(@RequestParam(value = "empId") String empId, @RequestParam(value="empPw") String empPw, Model model) {
			//String path = employeeDeleteService.execute(empId, empPw, model);
			//return path;
		employeeDeleteService.execute(empId, empPw, model);
		return "thymeleaf/employee/empdel";
	}
	
	@RequestMapping("empInfo")
	public String empInfo(@RequestParam(value="empId") String empId, Model model) {
		employeeInfoService.execute(empId, model);
		return "thymeleaf/employee/empDetail";
	}
	
	@RequestMapping("empList")
	public String empList(Model model) {
		employeeListService.execute(model);
		return "thymeleaf/employee/empList";
	}
	
	@RequestMapping("empJoin")
	public String empJoin(Model model) {
		//model.addAttribute("employeeCommand", new EmployeeCommand()); 이거 맨위엥 modelAttribute랑 똑같음
		return "thymeleaf/employee/empForm";
	}
	
	@RequestMapping("empWrite")
	public String empWrite(@Validated EmployeeCommand employeeCommand, BindingResult result) { 
							//command 바로 뒤에 binding result가 나와야해 둘 사이에 누가 끼어있으면 잘 안댐
							//bindingresult는 command 없이도 사용가능
		if(result.hasErrors()) {
			return "thymeleaf/employee/empForm";
		}
		if(!employeeCommand.IsEmpPwEqualsEmpPwCon()) {//비밀번호와 비밀번호 확인이 다르면
			result.rejectValue("empPwCon", "employeeCommand.empPwCon", "비밀번호와 비밀번호 확인이 다릅니다.");
			return "thymeleaf/employee/empForm";
			//에러처리 나중에한대
		}
		employeeWriteService.execute(employeeCommand);
		return "redirect:empList";
	}
}
