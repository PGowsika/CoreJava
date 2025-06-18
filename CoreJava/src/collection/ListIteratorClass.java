package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorClass {

	public static void main(String[] args) {
		List a1 = new ArrayList();
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		System.out.println(a1);
		System.out.println("Forward iterate using for loop");
		for(int i=0; i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("Backward iterate using for loop");
		for(int i=a1.size()-1; i>=0;i--) {
			System.out.println(a1.get(i));
		}
		
		System.out.println("Forward iterate using for-each loop");
		for(Object i : a1) {
			System.out.println(i);
		}
		
	  /*System.out.println("Backward iterate using for-each loop");
		Collections.reverse(a1);
		for(Object i : a1) {
			System.out.println(i);
		}
	*/
		
		//Collections.reverse(a1);
		System.out.println("Forward iterate using Iterator Interface");
		Iterator itr = a1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Forward iterate using ListIterator ");
		ListIterator litr = a1.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		
		System.out.println("Forward iterate using ListIterator ");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		
		System.out.println();
		System.out.println("Other listIterator Methods :");
		litr.add(0);
		litr.add(10);
		System.out.println("after add() : " + a1);
		litr.next();
		litr.set(50);
		System.out.println("After set() : " + a1);
		System.out.println("nextIndex() : " + litr.nextIndex());
		System.out.println("PreviousIndex() : " + litr.previousIndex());
	}

}
