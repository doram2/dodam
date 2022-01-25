package main.service;

import main.DTO.CachedMemberDao;
import main.DTO.MemberDTO;

public class ChangePasswordService {
	//의존객체
	CachedMemberDao memberDao = new CachedMemberDao();
	public void execute(String email, String oldPw, String newPw) {
		MemberDTO dto = memberDao.selectByEmail(email);
		if(dto == null) {
			System.out.println("이메일이 존재하지 않습니다");
			return;
		}
		dto.changePassword(oldPw, newPw);
		memberDao.update(dto);
	}
}
