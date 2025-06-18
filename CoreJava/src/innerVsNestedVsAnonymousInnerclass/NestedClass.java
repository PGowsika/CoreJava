package innerVsNestedVsAnonymousInnerclass;

class A1{
	private static int i;
	 public A1(int i) 
	 {
		 this.i= i;
	 }
	 
	 static class B1{
		 public void display() {
			 System.out.println("Nested class : i = " + i);
		 }
	 }
}
public class NestedClass {

	public static void main(String[] args) {
		
		A1 a = new A1(25);
		A1.B1 b = new A1.B1();
		b.display();

	}

}
