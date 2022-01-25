package hw1;

public class Q30 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 6; j++) {
				int num = (int)(Math.random()*45+1);
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

}
