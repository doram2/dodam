
public class Ex03 {
	int first;
	int second;
	static int val; //클래스 내에 존재하는 변수 //클래스 변수
					//모든 객체내에서 값을 공유해서 사용해야 하는 경우에 생성
	int val1;
	public int add(/*Ex03 this*/) {
		return val + this.first;
	}
	public static int sub() { //this. 가 존재x
		//return val - val1
		//static 메서드에서는 instance 변수를 사용할 수 없다.
		return val; 
	} //누구의 instance 인 지 알 수 없으므로 static 기재 필요
	
}
