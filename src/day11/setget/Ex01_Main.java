package day11.setget;

public class Ex01_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 this�� Ŭ���� �ڱ� �ڽ��� ��ġ ������ ������ �ִ�.
		 ��� �޼ҵ带 ����� �ڵ������� �����ȴ�.
		 */
		Ex01_this ex = new Ex01_this();
		System.out.println("ex : " + ex);
		Ex01_this ex01 = ex;
		System.out.println("ex01 : " + ex01);
		ex.a = 7777;
		ex.func01();
		ex.func02();
	}

}
