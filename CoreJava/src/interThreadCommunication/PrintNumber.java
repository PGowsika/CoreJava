package interThreadCommunication;

public class PrintNumber {
	
	boolean flag = false;

	public synchronized void printOdd(int num) {
		while(flag) {
			try 
			{
				wait(500);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Odd : " + num);
		flag = true;
		notify();
	}
	
	public synchronized void printEven(int num) {
		while(!flag) {
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Even : " + num);
		flag=false;
		notify();
	
	}
}
