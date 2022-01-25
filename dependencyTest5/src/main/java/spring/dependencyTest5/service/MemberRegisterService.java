package spring.dependencyTest5.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import spring.dependencyTest5.DTO.MemberDAO;
import spring.dependencyTest5.DTO.MemberDTO;
import spring.dependencyTest5.DTO.RegisterRequest;

public class MemberRegisterService {
	@Autowired
	MemberDAO memberDao;

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
