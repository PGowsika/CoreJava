package methodReference;

public class MainMethod {
	
	double x;
	int y;
	MainMethod(double x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x*y);
	}

	public static void main(String[] args) {
		/*MainMethod obj1 = new MainMethod();
		MyInterface obj2 = obj1::m1;  // method reference to a Non-Static method
		double res = obj2.add(10.2, 2);
		System.out.println(res);*/
		
		
		//method reference to constructor
		//MainMethod obj1 = new MainMethod(20.3,15);
		MyInterface obj2 = MainMethod::new;
		obj2.product(4.0, 3);
		
		//method reference to a Static method
		/*MyInterface obj = MainMethod::m2; 
		double res = obj.add(15.2, 2);
		System.out.println(res);*/
		
	}

	double m1(double x, int y) {
		return x+y;
	}
	static double m2(double x, int y) {
		return x+y;
	}
}
