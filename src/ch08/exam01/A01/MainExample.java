package ch08.exam01.A01;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat("길냥이");
		cat.displayInfo();
		cat.sound();
		
	    // Dog 객체 생성 및 메소드 호출
        Animal dog = new Dog("Max");
        dog.displayInfo();  // 출력: Animal: Max
        dog.sound();        // 출력: Bark
	}

}
