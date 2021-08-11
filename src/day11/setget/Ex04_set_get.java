package day11.setget;

public class Ex04_set_get {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		minusAge();
	}
	private void minusAge() {
		this.age -= 1;
	}
}
