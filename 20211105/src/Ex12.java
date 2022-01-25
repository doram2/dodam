
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			int a = 10;
			//변수 i, a를 블럭변수라고 한다. 블럭 변수는 블럭 안에서만 사용 가능
		}
		/*블럭 밖에서 블럭 변수 호출 시 오류 발생
		System.out.println(i);
		System.out.println(a);
		 */
	}

}
