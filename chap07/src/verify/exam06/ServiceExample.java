package verify.exam06;

public class ServiceExample {

	public static void main(String[] args) {
		Controller controller = new Controller();
		// controller.setService(new Service()); 강제 형변환이라서 안된다.
		// controller.service.login(); 위에게 안되니까 당연히 안됨
		controller.setService(new MemberService());
		controller.service.login();
		
		controller.setService(new AService());
		controller.service.login();
	}

}
