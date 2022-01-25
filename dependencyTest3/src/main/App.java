package main;

import java.util.Scanner;

import main.DTO.CachedMemberDao;
import main.DTO.MemberDAO;
import main.DTO.RegisterRequest;
import main.service.Assembler;
import main.service.ChangePasswordService;
import main.service.MemberInfoPrinter;
import main.service.MemberListPrinter;
import main.service.MemberPrinter;
import main.service.MemberRegisterService;

public class App {
	// FrontController
	static Assembler assembler = new Assembler();
	//static MemberDAO memberdao = new CachedMemberDao();
	//static MemberPrinter printer = new MemberPrinter();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("��ɾ �Է��ϼ���");
			String command = sc.nextLine();
			if (command.startsWith("new ")) {
				String[] arg = command.split(" ");
				if (arg.length != 5) {
					printHelp();
					System.out.println();
					continue;
				}
				RegisterRequest req = new RegisterRequest();
				req.setEmail(arg[1]);
				req.setName(arg[2]);
				req.setPassword(arg[3]);
				req.setConfirmPassword(arg[4]);
				boolean bl = req.isPasswordEqualConfirmPassword();
				if(!bl) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					continue;
				}
				//������ü
				MemberRegisterService action = assembler.getMemberRegisterService();
				action.execute(req);
			}else if (command.endsWith("list")) {
				//������ü
				MemberListPrinter listPrint = assembler.getMemberListPrinter();
				listPrint.printAll();
			}else if(command.startsWith("change ")) {
				String[] arg = command.split(" ");
				if(arg.length != 4) {
					printHelp();
					continue;
				}
				ChangePasswordService action = assembler.getChangePasswordService();
				action.execute(arg[1], arg[2], arg[3]);
			}else if (command.startsWith("info ")) {
				String[] arg = command.split(" ");
				if(arg.length != 2) {
					printHelp();
					continue;
				}
				MemberInfoPrinter action = assembler.getMemberInfoPrinter();
			}else if (command.equals("exit")) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}
			else {
				printHelp();
			}
		}
	}

	public static void printHelp() {
		System.out.println();
		System.out.println("��ɾ� ����");
		System.out.println("new �̸��� �̸� ��ȣ ��ȣȮ��");
		System.out.println("change �̸��� �����ȣ �����ȣ");
		System.out.println("list");
		System.out.println("info �̸���");
		System.out.println("���α׷� ����� exit");
	}

}
