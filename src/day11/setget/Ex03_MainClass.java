package day11.setget;

public class Ex03_MainClass {
	public static void main(String[] args) {
		Ex03_set_get ex = new Ex03_set_get();
		ex.setNum(1220);
		int num = ex.getNum() - 500;
		System.out.println(num);
	}
}
