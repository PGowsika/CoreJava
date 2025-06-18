package abstraction;

public class AbstractionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v;
		Bicycle obj = new Bicycle();
		v=obj;
		v.display1();
		
		System.out.println("Display details of Bicycle");
		v.speedUp(6);
		v.gearUp(5);
		v.handBrake(2);
		obj.display(); // only belong to Bicycle class
		
		Bike b = new Bike();
		v=b;
		System.out.println("Display details of Bike");
		v.speedUp(8);
		v.gearUp(10);
		v.handBrake(4);
		b.display(); // only belong to Bike class
		
		Animal a = new dog();
		a.makeSound();
		a.display(10);
	}

}
