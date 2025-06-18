package exceptionhandling;

public class Finally {

	public static void main(String[] args) {
		try 
		{
			System.out.println("Inside try block");
			///int a=10/5;
			int a = 10/0;
			System.out.println("No exception. \n a = " + a);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Inside catch block");
			System.out.println("ArithmeticException :" + e.getMessage());
		}
		finally 
		{
			System.out.println("Inside finally block1");
			try
			{
				int x[] = {10, 20, 30};
				System.out.println(x[4]);
			}
			
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println("ArrayIndexOutOfBoundsException : " + e1.getMessage());
			}
			catch(Exception ex) {
				
			}
			
			
			finally 
			{
				System.out.println("Inside finally block2");
				try 
				{
					int y[] = new int[-10];
				}
				catch(NegativeArraySizeException e2)
				{
					System.out.println("NegativeArraySizeException : " + e2.getMessage());
				}
				finally 
				{
					System.out.println("Inside finally block3");
				}
			}
			
		}

	}

}
