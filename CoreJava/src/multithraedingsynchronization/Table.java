package multithraedingsynchronization;

public class Table {
	// by normal
	/*public void printTable(int n) 
	{
		for(int i=1 ; i<=10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(n + " * " + i + " = " + n*i);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}*/
	// synchronized method
	/*public synchronized void printTable(int n) // synchronized method
	{
		for(int i=1 ; i<=10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(n + " * " + i + " = " + n*i);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}*/
	
	/*public void printTable(int n){
		
	synchronized (this) //synchronized block
	{
		for(int i=1 ; i<=10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(n + " * " + i + " = " + n*i);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	}	*/
	
	// static synchronization
	public static synchronized void printTable(int n) 
	{
		for(int i=1 ; i<=10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(n + " * " + i + " = " + n*i);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}
	}

}
