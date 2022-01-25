package main.service;

import main.DTO.CachedMemberDao;
import main.DTO.MemberDTO;

public class ChangePasswordService {
	//������ü
	CachedMemberDao memberDao = new CachedMemberDao();
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
