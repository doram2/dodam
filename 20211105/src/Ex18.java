
public class Ex18 {

	public static void main(String[] args) {
		int gop = 1;
		while(gop <= 9) {
			System.out.println("3 * "+gop+" = "+3*gop);
			gop++;
		}
		
		gop = 1;
		while(gop <= 9) {
			System.out.println("4 * "+gop+" = "+4*gop);
			gop++;
		}
		
		gop = 1;
		while(gop <= 9) {
			System.out.println("5 * "+gop+" = "+5*gop);
			gop++;
		}
		
		for(int dan = 3; dan <= 5; dan++) {
			for(gop = 1; gop <= 9; gop++) {
				System.out.println(dan+" * "+gop+" = "+dan*gop);
			}
		}
	}

}
