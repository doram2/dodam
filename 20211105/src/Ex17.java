
public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("===========");
		
		sum = 0;
		int i = 1;
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		System.out.println("===========");
		
		sum = 0;
		i = 1;
		while(true) {
			sum += i;
			i++;
			if(i > 100) break;
		}
		System.out.println(sum);
	}

}
