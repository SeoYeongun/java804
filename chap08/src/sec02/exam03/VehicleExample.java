package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		//vehicle.checkFare();
		
		Bus bus = (Bus) vehicle; //강제 형변환 Bus 클래스에만 있는 checkFare 메소드를 실행할려고
		
		bus.run();
		bus.checkFare();
	}

}
