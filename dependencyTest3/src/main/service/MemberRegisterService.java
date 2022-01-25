package main.service;

import java.util.Date;

import main.DTO.MemberDAO;
import main.DTO.MemberDTO;
import main.DTO.RegisterRequest;

public class MemberRegisterService {
	//������ü(dependency)
	MemberDAO memberDao;
	//������ü ����
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
			System.out.println("����� ����� �Ϸ�Ǿ����ϴ�.");
		}else {
			System.out.println("�ߺ� ������Դϴ�.");
		}
		
	}
}
