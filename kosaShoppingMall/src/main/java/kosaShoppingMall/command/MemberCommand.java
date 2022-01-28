package kosaShoppingMall.command;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class MemberCommand {
	
	@Size(min = 10, max = 10, message = "번호를 입력하세요.")
	String memberNum;
	
	@NotNull(message = "아이디를 입력하세요.")
	String memberId;
	
	@NotBlank(message = "비밀번호를 입력하세요.")
	String memberPw;
	
	@NotBlank(message = "비밀번호 확인을 입력하세요.")
	String memberPwCon;
	
	@NotBlank(message = "이름을 입력하세요.")
	String memberName;
	
	@NotBlank(message = "주소를 입력하세요.")
	String memberAddr;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	//@NotNull(message = "등록일을 입력하세요.") 나는 sysdate지롱
	Date memberRegist;
	
	@NotBlank(message = "성별을 선택하세요.")
	String gender;
	
	@NotBlank(message = "연락처를 입력하세요.")
	String memberPhone;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date memberBirth;
	
	@Email(message = "형식에 맞지 않습니다.")
	@NotBlank(message = "이메일을 입력하세요")
	String memberEmail;

	
	public boolean IsMemberPwEqualsMemberPwCon() {
		return memberPw.equals(memberPwCon);
	} 
}
