package verify.exam05;

public class Child extends Parent {
	private String name; 
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	public Child(String nation) {
		this.name = name;
		System.out.println("Child(String nation) call");
	}
}
