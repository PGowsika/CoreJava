package multithraeding;

public class ChildThread implements Runnable {
	
	public void run() {
		System.out.println("Child-thread Starts");
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child-thread : " + i);
			try {
				Thread.sleep(500);//in milli-second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Child-thread ends");
		
	}
} 

	
