
public class Ex03 {

	public static void main(String[] args) {
		// 8´Ü Ãâ·Â
		int num = (int)(Math.random()*9 + 1);
		
		if (num == 1) System.out.println("8 * 1 = 8");
		else if (num == 2) System.out.println("8 * 2 = 16");
		else if (num == 3) System.out.println("8 * 3 = 24");
		else if (num == 4) System.out.println("8 * 4 = 32");
		else if (num == 5) System.out.println("8 * 5 = 40");
		else if (num == 6) System.out.println("8 * 6 = 48");
		else if (num == 7) System.out.println("8 * 7 = 56");
		else if (num == 8) System.out.println("8 * 8 = 64");
		else if (num == 9) System.out.println("8 * 9 = 72");
		
		System.out.println("=======switch=======");
		
		switch(num) {
		case 1: System.out.println("8 * 1 = 8"); break;
		case 2: System.out.println("8 * 2 = 16"); break;
		case 3: System.out.println("8 * 3 = 24"); break;
		case 4: System.out.println("8 * 4 = 32"); break;
		case 5: System.out.println("8 * 5 = 40"); break;
		case 6: System.out.println("8 * 6 = 48"); break;
		case 7: System.out.println("8 * 7 = 56"); break;
		case 8: System.out.println("8 * 8 = 64"); break;
		case 9: System.out.println("8 * 9 = 72"); break;
		 
		}
	}

}
