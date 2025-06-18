package multithraeding;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("Main-thread Starts");
		ChildThread obj = new ChildThread();
		Thread t = new Thread(obj);
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main-thread : " + i);
			try {
				Thread.sleep(1000);//in milli-second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Main-thread ends");
		

	}

}
