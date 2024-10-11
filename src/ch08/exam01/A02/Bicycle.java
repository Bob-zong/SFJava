package ch08.exam01.A02;

public class Bicycle implements Vehicle {
	
	@Override
	public void start() {
		System.out.println("자전거가 출발합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("자전거가 정지합니다.");
	}
}
