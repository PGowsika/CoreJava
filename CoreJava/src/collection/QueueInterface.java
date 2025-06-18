package collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		
		Queue q = new PriorityQueue();
		q.add(13);
		
		q.add(3);
		q.add(0);
		q.add(2);
		//q.add(null);
		System.out.println(q);
		
		Queue q1 = new LinkedList();
		q1.add(13);
		q1.add(3);
		q1.add(0);
		q1.add(2);
		q1.add(null);
		System.out.println(q1);
	}

}
