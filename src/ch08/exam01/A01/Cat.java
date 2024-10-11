package ch08.exam01.A01;

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	
	@Override
	void sound() {
		System.out.println("냐옹");
	}
	
}
