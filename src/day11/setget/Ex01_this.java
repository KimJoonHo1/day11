package day11.setget;

public class Ex01_this {
	public int a = 10;
	public void func01() {
		int a = 12345;
		System.out.println("01 a : " + this.a);
		System.out.println("this : " + this);
	}
	public void func02() {
		System.out.println("02 a : " + a);
	}
}
