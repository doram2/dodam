package kosaShoppingMall.mappers;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kosaShoppingMall.domain.MemberDTO;

@Component
@Repository(value="kosaShoppingMall.mappers.MemberMapper")
public interface MemberMapper {
	Integer memberInsert(MemberDTO dto);

	List<MemberDTO> selectAll();

	MemberDTO selectOne(String memberNum);

	Integer memberUpdate(MemberDTO dto);
	
	Integer memberDelete(String memberNum);

	String numberGenerate();

}
