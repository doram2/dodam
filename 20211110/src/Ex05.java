
public class Ex05 {
	static int first;
	static int second;
	int val; //��� ����, instance ����
	
	static { //���������� �ʱ�ȭ �� �� �ִ�.
		first = 20;
		second = 10;
		//val1 = 10; instance ������ static ������ �ʱ�ȭ �� �� ����
	}
	public static int add() {//��ü�� �������� �ʰ� ����ϱ� ���� ���� �����޼ҵ�
		return first + second;
	}
}
