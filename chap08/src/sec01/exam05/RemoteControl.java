package sec01.exam05;

public interface RemoteControl {
	int MAX_VOLUME = 10; //static final 생략되어있음
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	void turnOn();   //public abstract 생략 되어있음
	void turnOff();
	void setVolume(int volume);
}
