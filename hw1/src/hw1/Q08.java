package hw1;

public class Q08 {

	public static void main(String[] args) {
		int cnt = 0;
		for(int i = 12; i <= 32; i++) {
			System.out.println("개발을 하려면 자바를 들이셔야 합니다.");
			cnt++;
			if(cnt == 4) break;
		}

	}

}
