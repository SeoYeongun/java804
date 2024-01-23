package sec01.exam05;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested(); //타입 객체이름 = 객체.new 멤버클래스();
		
		nested.print();
		outter.method();
	}

}
