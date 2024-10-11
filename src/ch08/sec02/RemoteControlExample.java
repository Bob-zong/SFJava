package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		RemoteControl rc;
//		rc = new Television();
//		
//		rc.turnOn();
//		
//		rc = new Audio();
//		
//		rc.turnOn();
		
//		System.out.println("리모콘 최대 볼륨: " + RemoteControl.MAX_VOLUME);
//		System.out.println("리모콘 최소 볼륨: " + RemoteControl.MIN_VOLUME);
		
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
	}	

}
