
public class Ex06 {

	public static void main(String[] args) {
	String location = "��õ";
	if(location.equals("����")) { //if(location == "����")
		System.out.println("���� ��������� 1350���Դϴ�.");
	}
	else if(location.equals("��õ")) {
		System.out.println("��õ ��������� 1250���Դϴ�.");
	}
	else if(location.equals("����")) {
		System.out.println("���� ��������� 1450���Դϴ�.");
	}
	
	
	System.out.println("======== switch ========");
	switch(location) {
	case "����":
		System.out.println("1350��"); break;
	case "��õ":
		System.out.println("1250��"); break;
	case "����":
		System.out.println("1450��"); break;
	}
	} 

}
