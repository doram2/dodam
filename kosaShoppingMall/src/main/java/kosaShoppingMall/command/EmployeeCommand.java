package kosaShoppingMall.command;

import lombok.Data;

@Data
public class EmployeeCommand { //command는 입력받는 값 다 적어줌. 부여하는거 ㄴㄴ DTO는 컬럼명이랑 똑같이
	String empId;
	String empPw;
	String empPwCon;
	String empName;
	String empAddr;
	String empPhone;
	
	public boolean IsEmpPwEqualsEmpPwCon() {
		return empPw.equals(empPwCon);
	} //true or false
}
