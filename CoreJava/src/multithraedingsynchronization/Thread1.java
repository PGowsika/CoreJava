package multithraedingsynchronization;

public class Thread1 extends Thread {
	
	Table t1;
	public Thread1(Table t1) {
		this.t1 = t1;
		
	}
	
	
	@Override
	public void run() {
		//t1.printTable(2);
		Table.printTable(2); // static synchronization
	}
}
