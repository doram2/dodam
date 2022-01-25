package spring.dependencyTest4.service;

import spring.dependencyTest4.DTO.MemberDAO;
import spring.dependencyTest4.DTO.MemberDTO;

public class MemberInfoPrinter {
	MemberDAO memberDao = new MemberDAO();
	MemberPrinter print = new MemberPrinter();
	//������ü 2��
	public MemberInfoPrinter(MemberDAO memberDao){
		this.memberDao = memberDao;
	}
	public void execute(String email) {
		MemberDTO dto = memberDao.selectByEmail(email);
		if(dto == null) {
			System.out.println("������ ����\n");
			return;
		}
		print.print(dto);
	}
}
