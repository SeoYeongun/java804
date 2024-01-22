package sec01.exam06;

public class MyClass {
	RemoteControl rc = new Television();
	
	MyClass(){
		
	}
	// 생성자로 매개변수를 받는다
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();
	}
	// 지역 변수로 필드 값을 받는다
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	// 메소드로 매개변수를 받는다
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
