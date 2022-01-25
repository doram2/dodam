//import java.io.*;
//import java.util.*;

public class Ex01 {

	public static void main(String[] args)/* throws IOException */{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		short sh = 10;
		int i = sh;
		sh = (short)i;
		short sh1 = 10;
		short sh2 = 20;
		//short sh3 = sh1 + sh2;
		int i1 = sh1 + sh2;
		short sh4 = (short)(sh1 + sh2);
		
		int money = 3500;
		if(money > 300) System.out.println("차를 타고 가시오");
		else System.out.println("걸어가시오");
	}

}
