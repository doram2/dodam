
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
		System.out.println(Ex03.val); //static������ Ŭ������. ���ε� ��� ����
		
		System.out.println("=================");
		int result = ex031.add();
		System.out.println(result);
		result = ex032.add(); //ex032.first�� ���� �����Ƿ� 0 + 30
		System.out.println(result);
		
		result = Ex03.sub(); //�޼��忡 staticŰ���忡�� Ŭ�������� �̿��ؼ� ����ϴ� �޼���
							 //�޼��� ������ thisŰ���� ����� �� ����
	}

}
