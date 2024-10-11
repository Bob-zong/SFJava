package ch06.exam01.A06;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		car.setBrand("벤츠");
		car.setSpeed(255);
		
		String brand = car.getBrand();
		double speed = car.getSpeed();
		
		System.out.println("자동차의 브랜드: " + brand);
		System.out.println("자동차의 속도: " + speed);
	}

}
