package main;

import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		NumberClass num = new NumberClass();
		num.setI(1);
		System.out.print("1: ");
		System.out.println(num.getI());
		
		NumberClass num1 = new NumberClass(10,20);
		System.out.print("2: ");
		System.out.println(num1.getI());
		
		NumberClass num2 = new NumberClass(new Test1());
		num1.setDate(new Date());
		System.out.print("3: ");
		num2.print();
		
		System.out.print("4: ");
		//num.print(); //setI로 i는 초기화했는데 test는 초기화안했잖아 그래서 에러남
		
		num.setTt(new Test1());
		num.print();
		num.datePrint();
	}
}
