import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AccountMain {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Account[] accs = new Account[100]; //배열의 인덱스는 0번부터 시작
		boolean run = true;
		
		int count = 0; // 배열의 인덱스를 가지기 위한 변수
		
		while(run) {
			bw.write("==============================================\n");
			bw.write("1. 계좌등록 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료\n");
			bw.write("==============================================\n");
		
			bw.write("번호를 입력하세요 > ");
			bw.flush();
			int select = Integer.parseInt(br.readLine());
		
			switch(select) {
			case 1:
				bw.write("계좌등록 페이지입니다.\n");
				bw.write("등록할 계좌번호를 입력하세요: ");
				bw.flush();
				String accountNo = br.readLine();
				
				bw.write("예금주: ");
				bw.flush();
				String owner = br.readLine();
				
				bw.write("금액: ");
				bw.flush();
				int money = Integer.parseInt(br.readLine());
				
				accs[count] = new Account(accountNo, owner, money);
				count++;
				
				System.out.println("계좌 등록이 완료되었습니다.");
				break;
			case 2:
				bw.write("계좌목록 페이지입니다.\n");
				bw.write("계좌번호\t\t계좌주\t\t금액\n");
				for(int i = 0; i < count; i++) {
					bw.write(accs[i].getAccountNo()+"\t\t"+accs[i].getOwner()+"\t\t"+accs[i].getBalance()+"\n");
				}
				bw.flush();
				break;
			case 3:
				bw.write("예금 페이지입니다.\n");
				bw.write("입금하실 계좌번호를 입력하세요: ");
				bw.flush();
				accountNo = br.readLine();
				System.out.println("입금하실 금액을 입력하세요: ");
				money = Integer.parseInt(br.readLine());
				
				for(int i = 0; i < count; i++) {
					if(accs[i].getAccountNo().equals(accountNo)) {
						accs[i].balance += money;
					}
				}
				
				break;
			case 4:
				bw.write("출금 페이지입니다.\n");
				bw.write("출금하실 계좌번호를 입력하세요: ");
				bw.flush();
				accountNo = br.readLine();
				System.out.println("출금하실 금액을 입력하세요: ");
				money = Integer.parseInt(br.readLine());
				
				for(int i = 0; i < count; i++) {
					if(accs[i].getAccountNo().equals(accountNo)) {
						accs[i].balance -= money;
					}
				}
				bw.flush();
				break;
			case 5:
				bw.write("프로그램을 종료합니다.\n");
				bw.flush();
				run = false;
				break;
			}
			
			
		}
		
		
		
	
	
	}


}
