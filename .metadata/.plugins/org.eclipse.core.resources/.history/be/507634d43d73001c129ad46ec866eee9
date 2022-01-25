package spring.dependencyTest4.service;

import java.util.Collection;

import spring.dependencyTest4.DTO.MemberDAO;
import spring.dependencyTest4.DTO.MemberDTO;

public class MemberListPrinter {
	MemberDAO memberDao;
	MemberPrinter print;
	public MemberListPrinter(MemberDAO memberDao, MemberPrinter print) {
		this.memberDao = memberDao;
		this.print = print;
	}
	public void printAll() {
		Collection<MemberDTO> lists = memberDao.selectAll();
		for(MemberDTO dto : lists) {
			print.print(dto);
		}
	}
}
