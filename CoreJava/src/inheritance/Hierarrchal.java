package inheritance;

class A1 // Super class
{
	void m1()
	{
		System.out.println("m1 in A1");
	}
}

class B1 extends A1 //sub class - 1
{
	@Override
	void m1() 
	{
		System.out.println("m1 in B1");
	}
	void m2() 
	{
		System.out.println("m2 in B1");
	}
	
}
class C1 extends A1 //sub class - 2
{
	@Override
	void m1() 
	{		
		System.out.println("m1 in C1");
	}
}
class D1 extends A1 //sub class - 3
{
	@Override
	void m1() 
	{
		System.out.println("m1 in D1");
	}
}
public class Hierarrchal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1();
		a.m1();
		
		a = new B1();// Upcasting - reference of subclass{new B1()} is assigned to super type(A1) object (a)
		a.m1();
		//a.m2(); 
		B1 b = new B1();
		b.m2();
		b.m1();
		
		a = new C1();// Upcasting - reference of subclass{new B1()} is assigned to super type(A1) object (a)
		a.m1();
		
		a = new D1();// Upcasting - reference of subclass{new B1()} is assigned to super type(A1) object (a)
		a.m1();
		
		
		
		A1 a1 = new B1();
		a1.m1();
		
		
		 B1 b1 =(B1)a1; //downcasting
		 
		 b1.m1();
		 b1.m2();
		 
	}

}
