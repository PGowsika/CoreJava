package innerVsNestedVsAnonymousInnerclass;

class A{
	private int i;
	 public A(int i) 
	 {
		 this.i= i;
	 }
	 
	 class B{
		 public void display() {
			 System.out.println("Inner class : i = " + i);
		 }
	 }
}


public class InnerClass {

	public static void main(String[] args) {
		A a1 = new A(25);
		A.B b1 = new A(55).new B();
		A.B B2 = a1.new B();
		b1.display();

	}

}
