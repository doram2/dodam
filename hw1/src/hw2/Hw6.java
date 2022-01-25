package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw6 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean keep = true;
		
		while(keep) {
			int value = 0;
			System.out.println("=============================");
			System.out.println("상품코드: 1,2,3,4,5");
			System.out.println("종료하려면 1~5외에 다른 숫자를 입력하세요.");
			System.out.println("=============================");
			System.out.print("상품코드를 입력하세요: ");
			int goods = Integer.parseInt(br.readLine());
			
			switch(goods) {
			case 1: value = 50000; break;
			case 2: value = 30000; break;
			case 3: value = 35000; break;
			case 4: value = 40000; break;
			case 5: value = 80000; break;
			default: keep = false; break;
		
			}
			if(!keep) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("수량을 입력하세요: ");
			int amount = Integer.parseInt(br.readLine());
			
		
			System.out.println(value*amount+"원 입니다.");
		}
	}

}
