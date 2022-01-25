package springBootTest2.domain;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeDTO {
	//컬럼명
	Integer empNum;
	String empName;
	String empId;
	String empPw;
	String empPwCon;
	Date empHireDate;
	String empEmail;
	Integer empSalary;
	String empPhone;
}
