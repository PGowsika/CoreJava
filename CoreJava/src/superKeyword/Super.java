package superKeyword;

public class Super {
	int a= 100;
	public Super() {
		System.out.println("Inside a super class constructor");
	}
	void display()
	{
		
		System.out.println("Inside super class diaplay() ");
	}
}

class Sub extends Super{
	int a= 200;
	public Sub() {
		super(); // calling super class constructor using super() in sub class
		System.out.println("Inside a sub class constructor");
		//super(); // NOTE : constructor call must be the first statement in the constructor
	}
	void display()
	{
		super.display();  // calling super class method with super keyword in sub class
		System.out.println("Super class Variable a = " + super.a); // calling super class variable with super keyword in sub class
		System.out.println("Sub class Variable a = " + a);
		System.out.println();
	}
	
}
