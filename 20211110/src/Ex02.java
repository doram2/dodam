
public class Ex02 {

	public static void main(String[] args) {
		int[] i= new int[3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		
		int i1 = 10;
		Account ac = new Account();
		
		Account[] accs = new Account[3];
		accs[0] = new Account("1111","김춘식",200); //클래스 배열 생성시 원소에 객체가 들어가야 함
		accs[1] = new Account("2222","김일이",300);
	
		String[] str = new String[3];
		str[0] = "김춘식";
		str[1] = "김일이";
		str[2] = "김이삼";
	}

}
