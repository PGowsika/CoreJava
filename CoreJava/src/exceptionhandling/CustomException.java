package exceptionhandling;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		System.out.println("Inside main Method");
		m1();
	}

	static void m1()
	{
		System.out.println("Inside m1() method");
		try
		{
			Scanner sc = new Scanner(System.in);
			//System.out.println("Enter the number :");
			//int a= sc.nextInt();
			int a=10;
			if(a<0)
				throw new Exception("Negative number is not allowed");
			System.out.println("a = " + a);
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block");
			System.out.println(e.getMessage());
		}
		
	}

}
