package com.example;

public class MethodOverloading {
	
	private final void display() //Non Static method
	{
		System.out.println("Private method overload");
	}
	
	private static final void display(int a)
	{
		
		System.out.println("Passing Integer");
		System.out.println(a);
	}
	private static final void display(String a)
	{
		System.out.println("Passing String");
		System.out.println(a);
	}
	private static final void display(int a, String x)
	{
		System.out.println("Passing Integer, String");
		System.out.println(a);
		//System.out.println("Passing String");
		System.out.println(x);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MethodOverloading().display();// Calling non static method
		display(2); // calling static method of same class
		display("hello");// calling static method of same class
		display(4, "Welcome");// calling static method of same class
		
		
		
		demo obj = new demo(); // Calling non static method  of different class of same package
		obj.display(2);
		obj.display(10, "Demo");
		obj.display("Demo", 111);
		
		new demo().display(3);// Calling non static method  of different class of same package
		
		demo.display(); // calling static method of different class of same package
		demo.display(500.0);
		demo.display("Static");
		demo.display(200.0, "String");
		
	}

}
