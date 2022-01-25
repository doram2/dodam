package spring.dependencyTest4.service;

import java.util.Date;

import spring.dependencyTest4.DTO.MemberDAO;
import spring.dependencyTest4.DTO.MemberDTO;
import spring.dependencyTest4.DTO.RegisterRequest;

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
