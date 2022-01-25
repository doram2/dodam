
public class Ex16 {

	public static void main(String[] args) {
		//È¦¼ö°ö¸¸ Ãâ·ÂÇÏ½Ã¿À
		for(int gop = 1; gop <= 9; gop +=2) {
			System.out.println("7 * "+gop+" = "+7*gop);
		}

		System.out.println("==========================");
		
		for(int gop = 1; gop <= 9; gop +=2) {
			if(gop % 2 == 0) continue;
			System.out.println("7 * "+gop+" = "+7*gop);
		}
		
		System.out.println("======");
		int gop = 1;
		while(true) {
			System.out.println("7 * "+gop+" = "+7*gop);
			gop++;
			if(gop > 9) break;
		}
	}

}
