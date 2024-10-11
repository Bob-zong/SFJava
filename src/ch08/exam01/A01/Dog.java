package ch08.exam01.A01;

public class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}
	
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}

}
