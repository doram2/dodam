package spring.dependencyTest4.service;

import spring.dependencyTest4.DTO.MemberDAO;

public class Assembler {//��ü������
	
	MemberDAO memberDao;
	MemberPrinter print;
	MemberRegisterService memberRegisterService;
	MemberListPrinter memberListPrinter;
	ChangePasswordService changePasswordService;
	MemberInfoPrinter memberInfoPrinter;
	
	public Assembler() {
		this.memberDao = new MemberDAO();
		this.print = new MemberPrinter();
		this.memberRegisterService = new MemberRegisterService(memberDao);
		this.memberListPrinter = new MemberListPrinter(memberDao, print);
		this.memberInfoPrinter = new MemberInfoPrinter(memberDao);
	}

	public MemberDAO getMemberDao() {
		return memberDao;
	}

	public MemberPrinter getPrint() {
		return print;
	}

	public MemberRegisterService getMemberRegisterService() {
		return memberRegisterService;
	}

	public MemberListPrinter getMemberListPrinter() {
		return memberListPrinter;
	}

	public ChangePasswordService getChangePasswordService() {
		return changePasswordService;
	}

	public MemberInfoPrinter getMemberInfoPrinter() {
		return memberInfoPrinter;
	}
}
