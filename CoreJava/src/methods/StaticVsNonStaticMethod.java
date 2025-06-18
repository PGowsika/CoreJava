package methods;


public class StaticVsNonStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create object to execute non-static methods of same class
		new StaticVsNonStaticMethod().NonStatic();
		StaticVsNonStaticMethod obj = new StaticVsNonStaticMethod();	
		obj.NonStatic(10);
		
		
		//  Create object to execute non-static methods of different class of same package
		demo obj1 = new demo();
		obj1.display(23);
		new demo().display();
		
		
		
		display(); // calling static method of same class
		demo.print(); // calling static method of different class of same package
		demo.print(500.0);
	}

	void NonStatic() {
		System.out.println("executing Nonstatic method in same class");
	}
	void NonStatic(int x) {
		System.out.println("executing Nonstatic method in same class with Parameter " + x);
		
	}
	static void display() // Static method
	{
		System.out.println("executing Static method in same class");
	}
}
