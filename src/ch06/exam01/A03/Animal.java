package ch06.exam01.A03;

public class Animal {
	private String name;
	//생성자 생성
	public Animal(String name) {
		this.name = name;
	}
	public void speak() {
		System.out.println(this.name + "가 소리를 낸다~");
	}
	
}
