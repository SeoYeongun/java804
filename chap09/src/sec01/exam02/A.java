package sec01.exam02;
//인스턴스 클래스 가 큰바구니, 정적 클래스가 작은 바구니. 작은 바구니에서 큰 바구니로 이동할 수 있지만 큰 바구니에서 작은 바구니로 이동 할 수 없다. 정적 클래스 안에는 정적 멤버만 선언 할 수 있다.
public class A {
	
	//인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드
	void method() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//static B field3 = new B();
	static C field4 = new C();
	
	static void method2() {
		//B var1 = new B();
		C var2 = new C();
	}
	
	
	//인스턴스 멤버 클래스
	class B{}
	//정적 멤버 클래스
	static class C{}
	
	//정적 클래스 안에는 인스턴스 클래스를 선언할 수 없다. 또 바깥 클래스가 정적 클래스면 멤버를 정적으로 선언한 정적멤버들만 정적 클래스 멤버 내부에 사용할 수 있다.
}
