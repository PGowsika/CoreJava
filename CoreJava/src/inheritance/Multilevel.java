package inheritance;


class A{
	int a=10;
	void m1() {
		System.out.println("m1 in A");
	}
}

class B extends A{
	int b = 20;
	void m2() {
		m1();
		int sum = a + b ;
		System.out.println("m2 in B");
		System.out.println("Sum = " + sum);
	}
}

class C extends B
{
	int c = 30;
	void m3() {
		m2();
		int mul = a* b * c ;
		System.out.println("m3 in C");
		System.out.println("Multiplication : " + mul);
		
	}
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C obj = new C();
		obj.m3();

	}

}
