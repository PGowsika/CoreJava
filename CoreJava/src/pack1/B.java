package pack1;

public class B {
	int b = 20;
	
	int get_b()
	{
		return b;
	}
	
	
	public int b1 = 200;
	public int get_b1() 
	{
		return b1;
	}
	
	public static void main(String[] args) {
		A obj = new A();
		System.out.println("a : " +obj.a);
		System.out.println("get_a : " +obj.get_a());
		System.out.println("a1 : " +obj.a1);
		System.out.println("get_a1 : " +obj.get_a1());
		System.out.println();
		
		B objb = new B();
		System.out.println("b : " + objb.b);
		System.out.println("get_b : " +objb.get_b());
		System.out.println("b1 : " +objb.b1);
		System.out.println("get_b1 : " +objb.get_b1());
		
		
		
		
	}


}
