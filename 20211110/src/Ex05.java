
public class Ex05 {
	static int first;
	static int second;
	int val; //멤버 변수, instance 변수
	
	static { //정적변수만 초기화 할 수 있다.
		first = 20;
		second = 10;
		//val1 = 10; instance 변수는 static 블럭에서 초기화 할 수 없다
	}
	public static int add() {//개체를 생성하지 않고 사용하기 위해 만든 정적메소드
		return first + second;
	}
}
