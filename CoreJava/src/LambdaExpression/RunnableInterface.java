package LambdaExpression;

public class RunnableInterface {

	public static void main(String[] args) {
		Runnable obj1 = new Runnable() 
		{
			@Override
			public void run() 
			{
				System.out.println("Anonnymous Inner class for run() ");
				
			}
		};
		
		Thread t1 = new Thread(obj1);
		t1.start();
		
		
		
		Runnable obj2 = () ->{
			System.out.println();
			System.out.println("Lambda Expression for run()");
		};
		
		Thread t2 = new Thread(obj2);
		t2.start();

	}

}
