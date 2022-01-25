package spring.dependencyTest5.service;

import org.springframework.beans.factory.annotation.Autowired;

import spring.dependencyTest5.DTO.MemberDAO;
import spring.dependencyTest5.DTO.MemberDTO;

public class MemberInfoPrinter {
	@Autowired
	MemberDAO memberDao;
	MemberPrinter print;
	
	public void execute(String email) {
		MemberDTO dto = memberDao.selectByEmail(email);
		if(dto == null) {
			System.out.println("������ ����\n");
			return;
		}
		print.print(dto);
	}
}
