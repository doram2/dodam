package main;

import java.util.Date;

public class NumberClass {
	
	private int i; //¸â¹ö´Â ÇÁ¶óÀÌºø. ÆÛºí¸¯¾È´ï
	private int j;
	Test1 tt; //Test1 tt = new Test1();
	Date date;
	
	public NumberClass() {}
	public NumberClass(int i, int j) {
		this.i = i;
		this.j = j;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void datePrint() {
		System.out.println(date.getDate());
	}
	
	public void print() {
		System.out.println(tt.getX());
	}
	public NumberClass(Test1 tt) {
		this.tt = tt;
	}
	public void setTt(Test1 tt) {
		this.tt = tt;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public int getJ() {
		return j;
	}
	
}
