package innerVsNestedVsAnonymousInnerclass;

interface anonymous{
	void m1();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		anonymous a = new anonymous() {
			
			@Override
			public void m1() {
				
				System.out.println("Anonymous Inner class");
			}
		};
		
		a.m1();
		
		new anonymous() {
			
			@Override
			public void m1() {
				System.out.println("Anonymous Inner class");
				
			}
		}.m1();
	}

}
