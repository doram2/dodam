
public class Ex01 {
	//하나로 묶어서 관리 -> 캡슐화(private와 그렇지 않은 멤버를 구분. private는 외부에서 접근 불가)
	//멤버필드, 멤버변수
	private int first;
	private int second;
	int result;
	
	public Ex01() {} // default 생성자
					 // 다른 생성자가 없는 경우 byte코드 파일에 자동으로 생기는 생성자
					 // 다른 생성자가 있는 경우 default 생성자를 명시해 주어야 한다.
	public Ex01(int first) {
		this.first = first;
		this.second = 20;
	}
	public Ex01(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	//메서드
	public void setFirst(int first) {
		this.first = first;
	}
	
	public int getFirst(int first) {
		return this.first;
	}

	public int getFirst() {
		return first;
	}

	public int getSecond() {
		return second;
	}

	public int getResult() {
		return this.result; //get에서 this. 붙여줘도 됨
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	public int add() {//메서드 오버로딩
		return this.first + this.second;
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public void add(int num1) {
		System.out.println(num1 + this.first);
	}
		
}
