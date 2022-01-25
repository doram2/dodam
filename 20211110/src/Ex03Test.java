
public class Ex03Test {

	public static void main(String[] args) {
		Ex03 ex031 = new Ex03();
		ex031.first = 10;
		ex031.second = 20;
		ex031.val = 30;
		
		Ex03 ex032 = new Ex03();
		System.out.println(ex032.first); //0
		System.out.println(ex032.second);
		System.out.println(ex032.val); //instace.val
		System.out.println(Ex03.val); //static변수는 클래스명. 으로도 사용 가능
		
		System.out.println("=================");
		int result = ex031.add();
		System.out.println(result);
		result = ex032.add(); //ex032.first의 값이 없으므로 0 + 30
		System.out.println(result);
		
		result = Ex03.sub(); //메서드에 static키워드에는 클래스명을 이용해서 사용하는 메서드
							 //메서드 내에서 this키워를 사용할 수 없음
	}

}
