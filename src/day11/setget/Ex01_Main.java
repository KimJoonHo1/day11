package day11.setget;

public class Ex01_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 this는 클래스 자기 자신의 위치 정보를 가지고 있다.
		 멤버 메소드를 만들면 자동적으로 생성된다.
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
