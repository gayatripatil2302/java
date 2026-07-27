package overriding;

public class Bike extends Vehicle {
	@Override
	void start() {
		System.out.println("bike start with button");
	}

}
