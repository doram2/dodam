import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AccountMain {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Account[] accs = new Account[100]; //�迭�� �ε����� 0������ ����
		boolean run = true;
		
		int count = 0; // �迭�� �ε����� ������ ���� ����
		
		while(run) {
			bw.write("==============================================\n");
			bw.write("1. ���µ�� | 2. ���� ��� | 3. ���� | 4. ��� | 5. ����\n");
			bw.write("==============================================\n");
		
			bw.write("��ȣ�� �Է��ϼ��� > ");
			bw.flush();
			int select = Integer.parseInt(br.readLine());
		
			switch(select) {
			case 1:
				bw.write("���µ�� �������Դϴ�.\n");
				bw.write("����� ���¹�ȣ�� �Է��ϼ���: ");
				bw.flush();
				String accountNo = br.readLine();
				
				bw.write("������: ");
				bw.flush();
				String owner = br.readLine();
				
				bw.write("�ݾ�: ");
				bw.flush();
				int money = Integer.parseInt(br.readLine());
				
				accs[count] = new Account(accountNo, owner, money);
				count++;
				
				System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");
				break;
			case 2:
				bw.write("���¸�� �������Դϴ�.\n");
				bw.write("���¹�ȣ\t\t������\t\t�ݾ�\n");
				for(int i = 0; i < count; i++) {
					bw.write(accs[i].getAccountNo()+"\t\t"+accs[i].getOwner()+"\t\t"+accs[i].getBalance()+"\n");
				}
				bw.flush();
				break;
			case 3:
				bw.write("���� �������Դϴ�.\n");
				bw.write("�Ա��Ͻ� ���¹�ȣ�� �Է��ϼ���: ");
				bw.flush();
				accountNo = br.readLine();
				System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ���: ");
				money = Integer.parseInt(br.readLine());
				
				for(int i = 0; i < count; i++) {
					if(accs[i].getAccountNo().equals(accountNo)) {
						accs[i].balance += money;
					}
				}
				
				break;
			case 4:
				bw.write("��� �������Դϴ�.\n");
				bw.write("����Ͻ� ���¹�ȣ�� �Է��ϼ���: ");
				bw.flush();
				accountNo = br.readLine();
				System.out.println("����Ͻ� �ݾ��� �Է��ϼ���: ");
				money = Integer.parseInt(br.readLine());
				
				for(int i = 0; i < count; i++) {
					if(accs[i].getAccountNo().equals(accountNo)) {
						accs[i].balance -= money;
					}
				}
				bw.flush();
				break;
			case 5:
				bw.write("���α׷��� �����մϴ�.\n");
				bw.flush();
				run = false;
				break;
			}
			
			
		}
		
		
		
	
	
	}


}
