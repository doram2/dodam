package hw2;

public class Hw1 {

	public static void main(String[] args) {
		char start = 'A';
		char end = 'Z';
		
		for(int i = 0; i < 26; i++) {
			System.out.print((char)(start+i));
			System.out.print((char)(end-i));
		}

	}

}
