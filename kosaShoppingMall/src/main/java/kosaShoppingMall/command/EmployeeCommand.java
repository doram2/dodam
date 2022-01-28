package kosaShoppingMall.command;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class EmployeeCommand { //command는 입력받는 값 다 적어줌. 부여하는거 ㄴㄴ DTO는 컬럼명이랑 똑같이
	
	@Size(min = 4, max = 12, message = "아이디는 4자에서 12자 사이로 입력하세요.")
	String empId;
	
	@NotEmpty(message = "비밀번호를 입력해주세요.") //공백문자 가능
	@Size(min = 3, max = 12)
	String empPw;
	
	@NotBlank(message = "비밀번호 확인을 입력해주세요.") //공백문자 불가능
	@Size(min = 3, max = 12)
	String empPwCon;
	
	@NotEmpty(message = "이름을 입력해주세요.")
	String empName;
	
	@NotEmpty(message = "주소를 입력해주세요.")
	String empAddr;
	
	@NotEmpty(message = "연락처를 입력해주세요.")
	String empPhone;
	
	public boolean IsEmpPwEqualsEmpPwCon() {
		return empPw.equals(empPwCon);
	} //true or false
}
