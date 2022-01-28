package kosaShoppingMall.controller;

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

import kosaShoppingMall.command.MemberCommand;
import kosaShoppingMall.service.member.MemberDeleteService;
import kosaShoppingMall.service.member.MemberDetailService;
import kosaShoppingMall.service.member.MemberListService;
import kosaShoppingMall.service.member.MemberModifyService;
import kosaShoppingMall.service.member.MemberNumberService;
import kosaShoppingMall.service.member.MemberUpdateService;
import kosaShoppingMall.service.member.MemberWriteService;

@Controller
@RequestMapping("mem")
public class MemberController {
	@Autowired
	MemberListService memberListService;
	@Autowired
	MemberWriteService memberWriteService;
	@Autowired
	MemberDetailService memberDetailService;
	@Autowired
	MemberUpdateService memberUpdateService;
	@Autowired
	MemberDeleteService memberDeleteService;
	@Autowired
	MemberNumberService memberNumberService;
	@Autowired
	MemberModifyService memberModifyService;
	
	@ModelAttribute
	MemberCommand setMemberCommand() {
		return new MemberCommand();
	}
	@RequestMapping("memDelete")
	public String memberDelete(@RequestParam(value="num") String memberNum, Model model) {
		memberDeleteService.execute(memberNum, model);
		//return "redirect:memList"; : ajax는 바로 redirect 불가능. next page 무적권 필요.
		return "thymeleaf/member/memberdel";
	}
	@RequestMapping("memUpdate")
	public String memberUpdate(MemberCommand memberCommand) {
		memberUpdateService.execute(memberCommand);
		return "redirect:memList";
	}
	@RequestMapping("memModify")
	public String memberModify(@Validated String memberNum, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "thymeleaf/member/memberModify";
		}
		if(!memberCommand.IsMemberPwEqualsMemberPwCon()) {
			result.rejectValue("memberPw", "memberCommand.memberPwCon", "비밀번호 확인이 다릅니다.");
			return "thymeleaf/member/memberModify";
		}
		memberModifyService.execute(memberNum, model);
		return "thymeleaf/member/memberDetail/"+memberCommand.getMemberNum();
	}
	
	//@RequestMapping("memDetail")
	@RequestMapping("memberDetail/{num}")
	public String memberDetail(@PathVariable(value="num") String memberNum, Model model) {
								//@RequestParam(value="num"): 아이디가 주소가 댐
		memberDetailService.execute(memberNum, model);
		return "thymeleaf/member/memberInfo";
	}
	
	@RequestMapping("memList")
	public String memberList(Model model) {
		memberListService.execute(model);
		return "thymeleaf/member/memberList";
	}
	
	@RequestMapping(value="memRegist", method = RequestMethod.GET)
	public String memberFormGet(MemberCommand memberCommand) {//폼을 여는 주소
		memberNumberService.execute(memberCommand);
		return "thymeleaf/member/memberForm";
	}
	
	@RequestMapping(value="memRegist", method = RequestMethod.POST)
	public String memberFormPost(@Validated MemberCommand memberCommand, BindingResult result) {//데이터를 전송하기 위한 주소
		if(result.hasErrors()) {
			return "thymeleaf/member/memberForm";
		}
		if(!memberCommand.IsMemberPwEqualsMemberPwCon()) {
			result.rejectValue("memberPw", "memberCommand.memberPwCon", "비밀번호 확인이 다릅니다.");
			return "thymeleaf/member/memberForm";
		}
		memberWriteService.execute(memberCommand);
		return "redirect:memList";
		
	}
}
