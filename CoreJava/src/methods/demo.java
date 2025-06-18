package methods;

public class demo {
	
	void display(int a)
	{
		System.out.println("execute non-static methods of different class of same package with Passing integer");
		System.out.println(a);
	}
		
	
	void display() {
		System.out.println("execute non-static methods of different class of same package");
	}
	
	static void print() {
		System.out.println("execute static methods of different class of same package");
	}
	
    static final void print(double a)
	{
		System.out.println("Passing Integer");
		System.out.println(a);
	}
	
	
}
