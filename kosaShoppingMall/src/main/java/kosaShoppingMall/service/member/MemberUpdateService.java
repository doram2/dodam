package kosaShoppingMall.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import kosaShoppingMall.command.MemberCommand;
import kosaShoppingMall.domain.MemberDTO;
import kosaShoppingMall.mappers.MemberMapper;
@Component
@Service
public class MemberUpdateService {
	@Autowired
	MemberMapper memberMapper;
	public void execute(MemberCommand memberCommand) {
		MemberDTO dto = new MemberDTO();
		dto.setMemberNum(memberCommand.getMemberNum());
		dto.setMemberRegist(memberCommand.getMemberRegist());
		dto.setMemberBirth(memberCommand.getMemberBirth());
		dto.setMemberAddr(memberCommand.getMemberAddr());
		dto.setMemberEmail(memberCommand.getMemberEmail());
		dto.setMemberId(memberCommand.getMemberId());
		dto.setMemberName(memberCommand.getMemberName());
		dto.setMemberPhone(memberCommand.getMemberPhone());
		dto.setMemberPw(memberCommand.getMemberPw());
		
		memberMapper.memberUpdate(dto);
	}
}
