package ch08.exam01.A02;

class Car implements Vehicle {
	@Override
	
	public void start() {
		System.out.println("자동차가 출발합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("자동차가 정지합니다.");
	}
}
