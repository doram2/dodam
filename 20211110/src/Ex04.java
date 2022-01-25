
public class Ex04 {
	static int first;
	static int second;
	int val;
	//static 변수는 생성자를 이용하여 초기화 할 수 없다.
	//static 변수를 초기화 할 때에는 static 블럭을 이용한다.
	static {
		first = 10;
		second = 20;
	}
	public Ex04(){}
	public Ex04(int val) {
		this.val = val;
	}
	
}
