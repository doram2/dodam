
public class Ex13 {

	public static void main(String[] args) {
		//5단 출력
		for(int i = 1; i <= 9; i++) {
			System.out.println("5 * "+i+" = "+ 5*i);
		}
		//6단 출력
		for(int i = 1; i <= 9; i++) {
			System.out.println("6 * "+i+" = "+ 6*i);
		}
		//7단 출력
		for(int i = 1; i <= 9; i++) {
			System.out.println("7 * "+i+" = "+ 7*i);
		}
		
		System.out.println("===============");
		
		for (int dan = 5; dan <= 7; dan++) {
			for(int gop = 1; gop <= 9; gop++) {
				System.out.println(dan+" * "+gop+" = "+dan*gop);
			}
		}
	}

}
