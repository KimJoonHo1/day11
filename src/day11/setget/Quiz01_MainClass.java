package day11.setget;

import java.util.Scanner;

public class Quiz01_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Quiz01_login login = new Quiz01_login();
		
		while(true) {
			System.out.println("1.로그인 2.가입 3.로그아웃");
			System.out.print(">>> ");
			int sel = scanner.nextInt();
			scanner.nextLine();
			switch(sel) {
				case 1:
					System.out.print("아이디 입력 : ");
					String id = scanner.nextLine();
					System.out.print("비밀번호 입력 : ");
					String pwd = scanner.nextLine();
					if(id.equals(login.getId()) && pwd.equals(login.getPwd())) {
						System.out.println("인증 통과");
					} else {
						System.out.println("인증 실패");
					}
					break;
				case 2:
					System.out.print("가입 아이디 입력 : ");
					String joinId = scanner.nextLine();
					System.out.print("가입 비밀번호 입력 : ");
					String joinPwd = scanner.nextLine();
					login.setId(joinId);
					login.setPwd(joinPwd);
					break;
				case 3:
					System.exit(1);
					break;
				default:
					System.out.println("잘못된 입력으로 종료합니다.");
					System.exit(1);
					break;
			}
		}
	}

}
