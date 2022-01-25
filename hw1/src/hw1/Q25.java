package hw1;

public class Q25 {

	public static void main(String[] args) {
		for(int dan = 6; dan <= 7; dan++) {
			System.out.println(dan+"단 시작");
			for(int gop = 4; gop <= 6; gop++) {
				System.out.println(dan+" * "+gop+" = "+dan*gop);
			}
			System.out.println(dan+"단 끝");
		}

	}

}
