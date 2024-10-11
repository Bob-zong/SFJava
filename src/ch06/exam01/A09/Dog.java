package ch06.exam01.A09;

public class Dog extends Animal{
	public static final String TYPE = "개";
	//소리를 내는 메소드 상속
	@Override
	public void makeSound() {
		System.out.println("멍멍");
	}
	
}
