package ch08.exam01.A02;

interface Vehicle {
	void start();
	void stop();
	
	// 디폴트 메소드 (기본 동작 정의)
    default void fuelStatus() {
        System.out.println("자동차 연료가 50% 남았습니다.");
    }
    
}
