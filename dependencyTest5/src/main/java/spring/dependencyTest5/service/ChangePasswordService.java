package spring.dependencyTest5.service;

import org.springframework.beans.factory.annotation.Autowired;

import spring.dependencyTest5.DTO.MemberDAO;
import spring.dependencyTest5.DTO.MemberDTO;

public class ChangePasswordService {
	@Autowired //xml로 부터 setter getter을 자동주입받도록함
	MemberDAO memberDao;

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
