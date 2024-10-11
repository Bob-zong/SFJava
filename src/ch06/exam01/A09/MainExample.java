package ch06.exam01.A09;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		 // 각각의 동물 소리 출력
        System.out.println("이 동물은 " + Dog.TYPE + "입니다.");
        myDog.makeSound(); // 출력: 멍멍!
        System.out.println("이 동물은 " + Cat.TYPE + "입니다.");
        myCat.makeSound(); // 출력: 야옹!
	}

}
