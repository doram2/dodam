
public class Ex14 {

	public static void main(String[] args) {
		// for���� �������
		for(int i = 1; i <= 9; i++) {
			System.out.println("5 * "+i+" = "+5*i);
		}
		/*
		 * i = 1    #1
		 * while i <= 9  #2
		 * 		print(i) #3
		 * 		i += 4   #4
		 */
		int i = 1;
		for(; i<=9;i++) {
			System.out.println("5 * "+i+" = "+5*i);
		}
		
		System.out.println("=========while==========");
		
		i = 1;
		while(i<=9) {
			System.out.println("5 * "+i+" = "+5*i);
			i++;
		}
		
		//while������ 3�� ���
		System.out.println("==============3��===============");
		i = 1;
		while(i <= 9) {
			System.out.println("3 * "+i+" = "+3*i);
			i++;
		}
		
		System.out.println("======= while =======");
		i = 3;
		while(i <= 7) {
			System.out.println("3 * "+i+" = "+3*i);
			i++;
		}
	}

}
