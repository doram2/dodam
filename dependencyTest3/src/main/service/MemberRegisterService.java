package main.service;

import java.util.Date;

import main.DTO.MemberDAO;
import main.DTO.MemberDTO;
import main.DTO.RegisterRequest;

public class MemberRegisterService {
	//의존객체(dependency)
	MemberDAO memberDao;
	//의존객체 주입
	public MemberRegisterService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	public void execute(RegisterRequest request) {
		MemberDTO dto = memberDao.selectByEmail(request.getEmail()); 
		if(dto == null) {
			dto = new MemberDTO();
			dto.setEmail(request.getEmail());
			dto.setName(request.getName());
			dto.setPassword(request.getPassword());
			dto.setRegisterDate(new Date());
			memberDao.insert(dto);
			System.out.println("사용자 등록이 완료되었습니다.");
		}else {
			System.out.println("중복 사용자입니다.");
		}
		
	}
}
