package deadlock;

public class MainMethod {

	public static void main(String[] args) {
		final Object lockA = new Object();
		final Object lockB = new Object();
		
		Thread t1 = new Thread()
		{
			@Override
			public void run() 
			{
				synchronized (lockA) 
				{
					System.out.println("Thread 1 obtain Lock A");
					try 
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e)
					{
						System.out.println("Thread 1 interrupted...");
					}
				}
				synchronized (lockB) 
				{	
					System.out.println("Thread 1 waiting for lock B");
				}
			}
		};
		
		Thread t2 = new Thread()
		{
			@Override
			public void run()
			{
				synchronized (lockB) 
				{
					System.out.println("Thread 2 obtain Lock B");
					try
					{
						Thread.sleep(1000);
					} 
					catch (InterruptedException e)
					{
						System.out.println("Thread 2 interrupted...");
					}				
				}
				synchronized (lockA) 
				{	
					System.out.println("Thread 2 waiting for lock A");
				}
			}
		};
		
		t1.start();
		t2.start();
		
		
		
	}
}	
