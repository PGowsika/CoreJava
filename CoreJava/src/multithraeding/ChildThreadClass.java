package multithraeding;

public class ChildThreadClass extends Thread {
	@Override
	public void run() {
		System.out.println("Child-thread Starts");
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child-thread : " + i);
			try {
				Thread.sleep(1000);//in milli-second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Child-thread ends");
		
	}
}
