import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex23 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("���� ���� �Է��ϼ���: ");
			int startDan = Integer.parseInt(br.readLine());
			System.out.print("���� ���� �Է��ϼ���: ");
			int endDan = Integer.parseInt(br.readLine());
			System.out.print("���� ���� �Է��ϼ���: ");
			int startGop = Integer.parseInt(br.readLine());
			System.out.print("���� ���� �Է��ϼ���: ");
			int endGop = Integer.parseInt(br.readLine());
			
			int dan = startDan;
			while (dan <= endDan) {
				int gop = startGop;
				while(gop <= endGop) {
					System.out.println(dan+"*"+gop+"="+dan*gop);
					gop++;
				}
				dan++;
			}
			
			System.out.println("�����Ϸ��� 'y'�� �Է��ϼ��� ");
			String stop = br.readLine();
			if(stop.equals("y")) {
				System.out.println("���α׷� ����");
				break;
			}
		}

	}

}
