package exceptionhandling;

import java.io.IOException;
import java.lang.Throwable;

public class ThrowVsThrowsVsThrowable {

	public static void main(String[] args) {
		
		try {
			m1();
		} catch (IOException e) {
			System.out.println("Inside IO exception block");
			System.out.println(e.getMessage());		
		}
		catch(ArithmeticException e2) {
			System.out.println("Inside arithmetic exception block");
			System.out.println(e2.getMessage());
			
		}

	}


	private static void m1() throws IOException, ArithmeticException
	{
		//throw new IOException("IOException Message Passed");
		throw new ArithmeticException("ArithmeticException message passed");
		
	}
	

}
