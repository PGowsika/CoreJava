package exceptionhandling;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionBlock {

	public static void main(String[] args) throws IOException {
		Scanner dis = new Scanner(System.in);
		int c,d;
		int x[] = {10, 20, 30};
		System.out.println("Enter the first number");
		c=dis.nextInt();
		System.out.println("Enter the second number");
		d=dis.nextInt();
		
		try
		{
		System.out.println("first /second : " +c/d); // if d= 0, then catch block executed
		System.out.println(x[4]);
		int y[] = new int[-10];
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught: " + e.getMessage()); //if d= 0, then Exception : java.lang.ArithmeticException: / by zero
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("ArrayIndexOutOfBoundsException : " + e1.getMessage());
		}
		catch(NegativeArraySizeException e2) {
			System.out.println("NegativeArraySizeException : " + e2.getMessage());
		}
		finally {
			System.out.println("Inside finally block");
		}
	}

}
