package kosaShoppingMall.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import kosaShoppingMall.command.MemberCommand;
import kosaShoppingMall.domain.MemberDTO;
import kosaShoppingMall.mappers.MemberMapper;

@Component
@Service
public class MemberModifyService {
	@Autowired
	MemberMapper memberMapper;
	public void execute(String memberNum, Model model) {
		MemberDTO dto = memberMapper.selectOne(memberNum);
		model.addAttribute("memberCommand", dto);
	}

}
