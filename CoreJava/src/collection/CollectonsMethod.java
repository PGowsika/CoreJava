package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectonsMethod {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Java");
		a1.add("C++");
		a1.add("Phython");
		a1.add(25);
		a1.add('@');
		a1.add(25.3);
		System.out.println("list in a1 : " + a1);
		System.out.println("size() : " + a1.size());
		System.out.println("isEmpty() : " + a1.isEmpty());
		//a1.clear();
		//System.out.println("list in a1: " + a1);
		//System.out.println("size() : " + a1.size());
		//System.out.println("isEmpty() : " + a1.isEmpty());
		
		ArrayList a2 = new ArrayList();
		a2.add("Progarm");
		a2.addAll(a1);
		System.out.println("list in a2 : " + a2);
		//cointains
		System.out.println("cointains() : " + a1.contains("Java"));
		System.out.println("containsAll() : " + a2.containsAll(a1));
		//remove
		a1.remove("Phython");
		System.out.println("list in a1 after remove(): " + a1);
		
		a1.removeAll(a2);
		System.out.println("list in a1 after removeAll(): " + a1);
		System.out.println("list in a2 after removeAll(): " + a2);
		
		System.out.println("a1.hashCode() : " + a1.hashCode());
		System.out.println("a2.hashCode() : " + a2.hashCode());
		
		System.out.println("a1.equals(a2) : " + a1.equals(a2));
		Object MyArray[] = a2.toArray();
		System.out.println("Myarray values :");
		for(int i = 0; i<MyArray.length; i++) {
			System.out.print(MyArray[i] + "\t");
		}
		System.out.println();
		System.out.println(" \nIterate the element using Iterator : ");
		Iterator iterator = a2.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		
		a2.remove(0);
		System.out.println("\nafter remove : " + a2);
		System.out.println("get() : " + a2.get(2));
}}
