
public class Ex03 {
	int first;
	int second;
	static int val; //Ŭ���� ���� �����ϴ� ���� //Ŭ���� ����
					//��� ��ü������ ���� �����ؼ� ����ؾ� �ϴ� ��쿡 ����
	int val1;
	public int add(/*Ex03 this*/) {
		return val + this.first;
	}
	public static int sub() { //this. �� ����x
		//return val - val1
		//static �޼��忡���� instance ������ ����� �� ����.
		return val; 
	} //������ instance �� �� �� �� �����Ƿ� static ���� �ʿ�
	
}
