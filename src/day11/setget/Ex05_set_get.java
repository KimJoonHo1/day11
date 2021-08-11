package day11.setget;

public class Ex05_set_get {
	private int kor, eng, math, sum;
	private double avg;
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int kor, int eng, int math) {
		this.sum = kor + eng + math;
		setAvg(this.sum);
	}
	public double getAvg() {
		return avg;
	}
	private void setAvg(int sum) {
		this.avg = sum / 3.0;
	}
}
