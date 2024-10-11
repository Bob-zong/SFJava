package ch08.exam01.A03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SmartPhone 객체 생성 및 메소드 호출
        SmartDevice phone = new SmartPhone();
        phone.turnOn();          // 출력: SmartPhone is turning on
        phone.connectToInternet(); // 출력: SmartPhone is connecting to the internet
        phone.turnOff();         // 출력: SmartPhone is turning off

	}

}
