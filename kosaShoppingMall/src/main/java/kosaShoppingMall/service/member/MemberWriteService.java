package kosaShoppingMall.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import kosaShoppingMall.command.MemberCommand;
import kosaShoppingMall.domain.MemberDTO;
import kosaShoppingMall.mappers.MemberMapper;

@Component
@Service
public class MemberWriteService {
	@Autowired
	MemberMapper MemberMapper;
	
	public String execute(MemberCommand memberCommand) {
		MemberDTO dto = new MemberDTO();
		dto.setMemberEmail(memberCommand.getMemberEmail());
		dto.setMemberId(memberCommand.getMemberId());
		dto.setMemberPw(memberCommand.getMemberPw());
		dto.setMemberName(memberCommand.getMemberName());
		dto.setMemberNum(memberCommand.getMemberNum());
		dto.setMemberBirth(memberCommand.getMemberBirth());
		dto.setMemberPhone(memberCommand.getMemberPhone());
		dto.setMemberAddr(memberCommand.getMemberAddr());
		dto.setMemberRegist(memberCommand.getMemberRegist());
		dto.setGender(memberCommand.getGender());
		
		MemberMapper.memberInsert(dto);
		
		return "redirect:memList";
	}
}
