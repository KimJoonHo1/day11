package day11.setget;

public class Ex05_Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 100, e = 90, m = 80;
		Ex05_set_get ex = new Ex05_set_get();
		ex.setKor(k);
		ex.setEng(e);
		ex.setMath(m);
		ex.setSum(k, e, m);
		
		System.out.println(ex.getKor());
		System.out.println(ex.getEng());
		System.out.println(ex.getMath());
		System.out.println(ex.getSum());
		System.out.println(ex.getAvg());
	}

}
