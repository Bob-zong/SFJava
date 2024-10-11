package ch08.exam01.A03;

public class SmartPhone implements SmartDevice{
	@Override
	public void turnOn() {
		System.out.println("스마트폰이 켜졌습니다.");	
	}
	
	@Override
	public void turnOff() {
		System.out.println("스마트폰이 꺼졌습니다");
	}
	
	@Override
	public void connectToInternet() {
		System.out.println("스마트폰이 인터넷에 연결됐습니다.");
	}
}
