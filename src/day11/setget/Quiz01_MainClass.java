package day11.setget;

import java.util.Scanner;

public class Quiz01_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Quiz01_login login = new Quiz01_login();
		
		while(true) {
			System.out.println("1.�α��� 2.���� 3.�α׾ƿ�");
			System.out.print(">>> ");
			int sel = scanner.nextInt();
			scanner.nextLine();
			switch(sel) {
				case 1:
					System.out.print("���̵� �Է� : ");
					String id = scanner.nextLine();
					System.out.print("��й�ȣ �Է� : ");
					String pwd = scanner.nextLine();
					if(id.equals(login.getId()) && pwd.equals(login.getPwd())) {
						System.out.println("���� ���");
					} else {
						System.out.println("���� ����");
					}
					break;
				case 2:
					System.out.print("���� ���̵� �Է� : ");
					String joinId = scanner.nextLine();
					System.out.print("���� ��й�ȣ �Է� : ");
					String joinPwd = scanner.nextLine();
					login.setId(joinId);
					login.setPwd(joinPwd);
					break;
				case 3:
					System.exit(1);
					break;
				default:
					System.out.println("�߸��� �Է����� �����մϴ�.");
					System.exit(1);
					break;
			}
		}
	}

}
