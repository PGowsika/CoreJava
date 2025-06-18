package multithraedingsynchronization;

public class SynchronizationMain {

	public static void main(String[] args) {
		Table t = new Table();
		Thread t1 = new Thread1(t);
		Thread t2 = new Thread2(t);
		t1.start();
		t2.start();
	}

}
