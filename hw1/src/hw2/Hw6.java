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
			System.out.println("��ǰ�ڵ�: 1,2,3,4,5");
			System.out.println("�����Ϸ��� 1~5�ܿ� �ٸ� ���ڸ� �Է��ϼ���.");
			System.out.println("=============================");
			System.out.print("��ǰ�ڵ带 �Է��ϼ���: ");
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
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.print("������ �Է��ϼ���: ");
			int amount = Integer.parseInt(br.readLine());
			
		
			System.out.println(value*amount+"�� �Դϴ�.");
		}
	}

}
