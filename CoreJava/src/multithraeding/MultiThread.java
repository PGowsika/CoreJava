package multithraeding;

public class MultiThread {

	public static void main(String[] args) {
		
		try {
			int max_priority = Thread.MAX_PRIORITY; //10
			System.out.println("MAX_PRIORITY : " +max_priority);
			int min_priority = Thread.MIN_PRIORITY; //1
			System.out.println("MIN_PRIORITY : " +min_priority);
			int normal_priority = Thread.NORM_PRIORITY; // 5
			System.out.println("NORM_PRIORITY : " + normal_priority);
			ChildThread1 obj1 = new ChildThread1("Thread-1", Thread.MAX_PRIORITY);
			ChildThread1 obj2 = new ChildThread1("Thread-2", Thread.MIN_PRIORITY );
			ChildThread1 obj3 = new ChildThread1("Thread-3", Thread.NORM_PRIORITY);
			
			Thread t1 = new Thread(obj1);
			t1.start();
			
			//t1.interrupt();
			Thread t2 = new Thread(obj2);
			t2.start();
			
			Thread t3 = new Thread(obj3);
			t3.start();
			
			
			System.out.println( Thread.currentThread().getName() + " Starts");
			System.out.println(t1.getName() +"  t1.isAlive() :" + t1.isAlive());
			System.out.println(t2.getName() +"  t2.isAlive() :" + t2.isAlive());
			System.out.println(t3.getName() +"  t3.isAlive() :" + t3.isAlive());
			
			for(int i=1;i<=5;i++)
			{
				System.out.println(Thread.currentThread().getName()+ " = " + i);
				Thread.sleep(1000);
			} 
		t1.join();
		t2.join();
		t3.join();
		
		
		System.out.println(t1.getName() +"  t1.isAlive() :" + t1.isAlive());
		System.out.println(t2.getName() +"  t2.isAlive() :" + t2.isAlive());
		System.out.println(t3.getName() +"  t3.isAlive() :" + t3.isAlive());
		
		System.out.println( Thread.currentThread().getName() + " ends");
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
