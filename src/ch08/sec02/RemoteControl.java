package ch08.sec02;

public interface RemoteControl {
	//public 추상 메소드

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
