package kosaShoppingMall.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kosaShoppingMall.command.MemberCommand;
import kosaShoppingMall.mappers.MemberMapper;

@Service

public class MemberNumberService {
	@Autowired
	MemberMapper memberMapper;
	public void execute(MemberCommand memberCommand) {
		String memberNum = memberMapper.numberGenerate();
		memberCommand.setMemberNum(memberNum);
		
	}
}
