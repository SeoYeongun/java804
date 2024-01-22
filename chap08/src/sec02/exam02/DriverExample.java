package sec02.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.driver(new Taxi());
		driver.driver(new Bus());
	}

}
