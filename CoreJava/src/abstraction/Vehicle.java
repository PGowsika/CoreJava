package abstraction;

public interface Vehicle {
	public void gearUp(int g);
	public void handBrake(int b);
	public void speedUp(int s);
	default void display1() {
		System.out.println(" inside interface\n");
	}

}

class Bicycle implements Vehicle{

	int gear;
	int brake;
	int speed;
	@Override
	public void gearUp(int g) {
		gear = g;
		speed = speed + 4;
	}

	@Override
	public void handBrake(int b) {
		brake = b;
		speed = speed - 2;
	}

	@Override
	public void speedUp(int s) {
			speed =s;	
	}
	void display() {
		System.out.println("SPEED : " + speed + "  GEAR : " + gear + "   HandBrake : " + brake);
	}
}


class Bike implements Vehicle{

	int gear;
	int brake;
	int speed;
	@Override
	public void gearUp(int g) {
		gear = g;
		speed = speed + 6;
	}

	@Override
	public void handBrake(int b) {
		brake = b;
		speed = speed - 4;
	}

	@Override
	public void speedUp(int s) {
			speed =s;	
	}
	void display() {
		System.out.println("SPEED : " + speed + "  GEAR : " + gear + "   HandBrake : " + brake);
	}
	
}
