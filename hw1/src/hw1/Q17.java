package hw1;

public class Q17 {

	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++) {
			int num = (int)(Math.random()*45 + 1);
			if(num %2 == 0) {
				System.out.println("3 * "+num+" = "+3*num);
			}
		}
	}

}
