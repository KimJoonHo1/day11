package day11.setget;

import java.util.Scanner;

public class Ex02_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Ex02_This ex = new Ex02_This();
		System.out.print("나이 입력 : ");
		int age = scanner.nextInt();
		ex.ageFunc(age);
		ex.printAge();
	}

}
