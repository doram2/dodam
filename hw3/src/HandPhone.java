import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HandPhone {
	static String fname = "C:\\Users\\user\\Desktop\\����\\juso.txt";
	
	static class address{
		String name;
		String age;
		String phone;
		
		address(String s1, String s2, String s3){
			this.name = s1;
			this.age = s2;
			this.phone = s3;
		}
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw;
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("\n## ģ�� ����ó ���� ## \n");
		String select = "";
		
		while(select != "4") {
			print_menu();
			select = br.readLine();
			
			switch(select) {
			case "1":
				view_juso();
				break;
			case "2":
				add_juso();
				break;
			case "3":
				delete_juso();
				break;
			case "4":
				return;
			default:
				System.out.println("\n�߸� �Է��߾��. �ٽ� �����ϼ���\n");
				
			}
		}
	}
		
	static void print_menu() {
		System.out.println("1. ����ó ���");
		System.out.println("2. ����ó ���");
		System.out.println("3. ����ó ����");
		System.out.println("4. ������");
	}
		
	static void view_juso() throws IOException {
		String str = "";
		
		File f = new File(fname);
		if(!f.exists()) {
			bw = new BufferedWriter(new FileWriter(fname));
			bw.close();
		}
		BufferedReader bf = new BufferedReader(new FileReader(fname));
		int i;
		for(i = 1;; i++) {
			if(!bf.ready()) break;
			else {
				str = bf.readLine();
				System.out.printf("%2d: %s\n",i,str);
			}
		}
		if(i == 1) System.out.println(" ** ����ó ���Ͽ� ��ȭ��ȣ�� �ϳ��� �����. **\n");
		
		bf.close();
	}
		
	static void add_juso() throws IOException{
		address adr = new address("","","");
		String wstr = "";
		bw = new BufferedWriter(new FileWriter(fname, true));
		System.out.println("�̸��� �Է� ==> ");
		adr.name = br.readLine();
		System.out.println("���̸� �Է� ==> ");
		adr.age = br.readLine();
		System.out.println("��ȭ��ȣ�� �Է� ==> ");
		adr.phone = br.readLine();
		
		wstr = adr.name + "\t\t" + adr.age + "\t\t" + adr.phone;
		
		bw.write(wstr);
		bw.newLine();
		
		bw.close();
			
	}
		
	static void delete_juso() throws IOException {
		String[] read_str = new String[50];
		String str = "";
		int del_line, i, count = 0;
		
		BufferedReader bf = new BufferedReader(new FileReader(fname));
		
		if(!bf.ready()) {
			System.out.println("!! ����ó ������ �����ϴ�. !!");
			return;
		}
		System.out.println("������ �� ��ȣ��?");
		del_line = Integer.parseInt(br.readLine());
		
		for(i = 0; i < 50; i++) {
			if((str = bf.readLine()) == null) break;
			if(i+1 != del_line) {
				read_str[count] = str;
				count++;
			}
			else {
				System.out.printf("%d���� �����Ǿ����ϴ�.", del_line);
			}
			
			bf.close();
			
			bw = new BufferedWriter(new FileWriter(fname));
		
			for(i = 0; i < count; i++) {
				bw.write(read_str[i]);
				bw.newLine();
			}

			bw.close();
		
		}
		
	}
}
