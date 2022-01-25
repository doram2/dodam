package spring.dependencyTest4.service;

import spring.dependencyTest4.DTO.MemberDTO;

public class MemberPrinter {
	public void print(MemberDTO dto) {
		System.out.printf("ȸ��������: ���̵� = %d, �̸��� = %s, �̸� = %s, ����� = %tF \n",
				dto.getId(), dto.getEmail(), dto.getName(), dto.getRegisterDate());
	}
}
