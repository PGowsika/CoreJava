package com.example;

public class demo {
	
	void display(int a)
	{
		System.out.println("Passing integer");
		System.out.println(a);
	}
	void display(int a, String x)  //Changing the Number of Parameters
	{
		System.out.println("Passing integer, string");
		System.out.println(a +"\t" + x);
	}
	void display(String a, int x) //Changing the Order of the Parameters of Methods
	{
		System.out.println("Passing integer, string");
		System.out.println(a +"\t" + x);
	}
	
	
	
	static void display() {
		System.out.println("Static method overloading");
	}
	
    static final void display(double a)
	{
		System.out.println("Passing Integer");
		System.out.println(a);
	}
	static final void display(String a)// Changing Data Types of the Arguments
	{
		System.out.println("Passing String");
		System.out.println(a);
	}
	static final void display(double a, String x)//  Changing the Number of Parameters
	{
		System.out.println("Passing Integer, String");
		System.out.println(a);
		//System.out.println("Passing String");
		System.out.println(x);
	}
	
}
