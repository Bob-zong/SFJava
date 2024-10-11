package ch06.exam01.A05;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("나이를 다시 입력해주세요");
		}
		else {
			this.age = age;	
		}
	}
	public void printPerson() {
		System.out.print("이름: "+ this.name + " " + "나이: " + this.age);
	}
}
