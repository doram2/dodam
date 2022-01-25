import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Board {
	
	public static int write_select;
	public static Writing[] writing;
	public static int count = 0;
	public static int select = 0;
	
	public static BufferedReader br;
	public static BufferedWriter bw;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		writing = new Writing[100];
		
		while(true) {
			view();
			
			select = Integer.parseInt(br.readLine());
			
			if(select == 1) {
				write();
				continue;
			}
			else if(select == 2) {
				detail();
			}
		}
	}
	

	private static void write() throws IOException{//�� �ۼ�
		while(true) {
			System.out.println("�� �ۼ� �������Դϴ�.");
			System.out.print("�۾���: ");
			String writer = br.readLine();
			
			System.out.print("����: ");
			String subject = br.readLine();
			
			System.out.print("����: ");				
			String content = br.readLine();
			writing[count] = new Writing(count+1, writer, subject, content);
			
			System.out.println("�����Ϸ��� 'y' �ٽ� ������ 'n'�� �Է��ϼ���");
			String save = br.readLine();
			if(save.equals("n")) {
				continue;
			}
			else if(save.equals("y")) {
				count++;
				break;
			}
			
		}
	}
	private static void detail() throws IOException { //�Խñ� ���� ���
		System.out.println("���� ���� �Խñ��� ��ȣ�� �Է��ϼ���: ");
		select = Integer.parseInt(br.readLine());
		//�Խñ� ���
		System.out.println("��ȣ: "+writing[select-1].getNum());
		System.out.println("�۾���: "+writing[select-1].getWriter());
		System.out.println("����: "+writing[select-1].getSubject());
		System.out.println("����: "+writing[select-1].getContent());
		writing[select-1].view++;
		//�Խñ� ��ȸ�� ����
		System.out.println();
		System.out.println("==========================================");
		System.out.println("1. ������ΰ��� | 2. ���� | 3. ����");
		System.out.print("��ȣ ���� >");
		int detail_select = Integer.parseInt(br.readLine());
		if(detail_select == 1) {
			//������� ���ư���
		}
		else if(detail_select == 2) {
			System.out.println("1. �۾��� ���� | 2. ���� ���� | 3. ���� ����");
			System.out.print("��ȣ ���� >");
			int k = Integer.parseInt(br.readLine());
			update(k);
		}
		else if(detail_select == 3) {
			writing[select-1].setNum(0);
		}
		
	}
	private static void view() throws IOException{//�Խñ� ��ȸ
		bw.write("�Խñ� ���\n");
		bw.write("��ȣ\t�۾���\t\t����\t\t��ȸ��\n");
		bw.flush();
		
		for(int i = 0; i < count; i++) {
			if(writing[i].getNum() == 0) {
				continue;
			}
			else {
			System.out.println(writing[i].getNum()+"\t"+writing[i].getWriter()+"\t\t"
								+writing[i].getSubject()+"\t\t"+writing[i].getView());
			}
		}
		System.out.println("==========================================");
		bw.write("1. �۾��� | 2. �󼼺���\n");
		bw.write("��ȣ���� > ");
		bw.flush();
	}
	private static void update(int k) throws IOException {//1. �۾��� ���� 2. ���� ���� 3. ���� ����
		if(k == 1) {
			System.out.println("�۾���: ");
			writing[select-1].setWriter(br.readLine());
		}
		else if(k == 2) {
			System.out.println("����: ");
			writing[select-1].setSubject(br.readLine());
		}
		else if(k == 3) {
			System.out.println("����: ");
			writing[select-1].setContent(br.readLine());
		}
		
		
	}
}
