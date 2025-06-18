package exceptionhandling;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws IOException
	{
		System.out.println("HelloWorld !");
		DataInputStream dis = new DataInputStream(System.in);
		int c,d;
		System.out.println("Enter the first number");
		c=Integer.parseInt(dis.readLine());
		System.out.println("Enter the second number");
		d=Integer.parseInt(dis.readLine());
		System.out.println("first /second : " +c/d); // if d= 0, then Exception in thread "main" java.lang.ArithmeticException: / by zero
		m1();
	}

	private static void m1() {
		m1(); // Exception in thread "main" java.lang.StackOverflowError
		System.out.println("m1");	
	}

}
