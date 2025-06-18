package exceptionhandling;

public class ExceptionPropagation {
	
	static void m1() {
		System.out.println("Inside m1()");
		int a=10/0;
	}
	static void m2() {
		System.out.println("Inside m2()");
		m1();
		
	}
	static void m3() {
		System.out.println("Inside m3()");
		m2();
	}
	

	public static void main(String[] args) {
		try {
			m3();
		}
		catch(Exception e) {
			System.out.println("Exception handled : " + e.getMessage());
		}
		System.out.println("Normal flow .....");
		

	}

}
