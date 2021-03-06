package springBootTest2.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;
@Data
@Alias("memberDTO")
public class MemberDTO {//컬럼명이랑 동일
	String memNum;
	String memName;
	Date memRegiDate;//dto는 데이터 포맷 필요없음.
	String memId;
	String memPw;
	String memPhone1;
	String memPhone2;
	String memAddr;
	String memEmail;
	String memGender;
	Date memBirth;
}
