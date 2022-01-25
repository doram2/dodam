package hw2;

public class Hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num = 1; num <= 9; num++) {
			System.out.print("\t"+num);
		}
		System.out.println();
		System.out.println("***********************************************************************************");
		for(int i = 1; i <= 9; i++) {
			System.out.print(i+"*\t");
			for(int j = 1; j <= 9; j++) {
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
		
	}

}
