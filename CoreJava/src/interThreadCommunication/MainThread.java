package interThreadCommunication;

public class MainThread {

	public static void main(String[] args) {
		PrintNumber p = new PrintNumber();
		OddThread t1 = new OddThread(p);
		EvenThread t2 = new EvenThread(p);
		t1.start();
		t2.start();
	}

}
