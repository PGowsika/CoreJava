package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		List l = new ArrayList(); //upcasting
		l.add("Java");
		l.add("SQL");
		l.add("Python");
		l.add("php");
		l.add("android");
		l.add(null);
		System.out.println(l);
		
		l.add(1, "C++");
		l.add("Java");
		System.out.println(l);
		
		l.set(4, "GoLang");
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		l.remove("GoLang");
		System.out.println(l);
		
		System.out.println(l.get(2));
		System.out.println(l.indexOf("Java"));
		System.out.println(l.lastIndexOf("Java"));
		System.out.println(l);
		
		System.out.println(l.subList(1, 3));
		System.out.println(l.subList(0, 4));
		
		System.out.println("using Iterator --------");
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Usinng ListIterator--------");
		ListIterator litr = l.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("Usinng ListIterator previous--------");
		//ListIterator litr = l.listIterator();
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		
		// Create a new vector
        Vector<Integer> v = new Vector<>(3, 2);

        // Add elements to the vector
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);

        // Insert an element at index 1
        v.insertElementAt(0, 0);
     

        // Remove the element at index 2
        v.removeElementAt(2);

        // Print the elements of the vector
        for (int i : v) {
            System.out.println(i);
        }
        
        System.out.println("\nVector elements are:"); 
        Enumeration e = v.elements(); 
        while (e.hasMoreElements()) 
            System.out.println(e.nextElement());
        
        
        
        
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(5);

        // Add an element to the beginning of the linked list
        linkedList.addFirst(0);

        // Add an element to the end of the linked list
        linkedList.addLast(4);

        // Print the elements of the linked list
        System.out.println("Print the elements of the linked list");
        for (int i : linkedList) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("get() : " + linkedList.get(2));
        
        
        
	}

}
