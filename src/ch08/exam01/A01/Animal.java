package ch08.exam01.A01;

abstract class Animal {
	String name;
	
	//생성자
	public Animal(String name) {
		this.name = name;
	}
	
	 // 추상 메소드 (자식 클래스에서 구현 필요)
    abstract void sound();
    
    // 일반 메소드 (공통 기능)
    public void displayInfo() {
        System.out.println("Animal: " + name);
    }
}
