package spring.dependencyTest4.service;

import spring.dependencyTest4.DTO.MemberDAO;
import spring.dependencyTest4.DTO.MemberDTO;

public class ChangePasswordService {
	//������ü
	MemberDAO memberDao;
	public ChangePasswordService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	public void execute(String email, String oldPw, String newPw) {
		MemberDTO dto = memberDao.selectByEmail(email);
		if(dto == null) {
			System.out.println("�̸����� �������� �ʽ��ϴ�");
			return;
		}
		dto.changePassword(oldPw, newPw);
		memberDao.update(dto);
	}
}
