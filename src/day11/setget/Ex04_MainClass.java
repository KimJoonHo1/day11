package day11.setget;

import java.util.Scanner;

public class Ex04_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		System.out.print("�̸� �Է� : ");
		name = scanner.next();
		System.out.print("���� �Է� : ");
		age = scanner.nextInt();
		
		Ex04_set_get ex = new Ex04_set_get();
		ex.setAge(age);
		ex.setName(name);
		
		System.out.println(ex.getName() + "���� ���̴� " + ex.getAge() + "�� �Դϴ�");
	}

}
