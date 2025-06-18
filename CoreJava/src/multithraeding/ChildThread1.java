package multithraeding;

public class ChildThread1  implements Runnable {

	Thread t;
	String ThreadName;
	
	
	public ChildThread1(String threadName, int priority) {
		ThreadName = threadName;
		t = new Thread(ThreadName);
		t.setName(threadName);
		t.setPriority(priority);
		t.start();
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Starts");
		System.out.println(Thread.currentThread().getName() + " Priority : " + t.getPriority() );
		
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " = " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " ends");
	}

}
