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
		//num.print(); //setI�� i�� �ʱ�ȭ�ߴµ� test�� �ʱ�ȭ�����ݾ� �׷��� ������
		
		num.setTt(new Test1());
		num.print();
		num.datePrint();
	}
}
