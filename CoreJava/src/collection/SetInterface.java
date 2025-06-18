package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {

		System.out.println("HashSet :");
		HashSet s1 = new HashSet();
		s1.add("Java");
		System.out.println(s1.hashCode());
		s1.add("SQL");
		System.out.println(s1.hashCode());
		s1.add("Java");
		System.out.println(s1.hashCode());
		s1.add(null);
		System.out.println(s1); // display randomly with unique values 
		
		System.out.println("LinkedHashSet : ");
		LinkedHashSet s2 = new LinkedHashSet();
		s2.add("java");
		s2.add("sQL");
		s2.add("python");
		s2.add("php");
		s2.add("android");
		s2.add(null);
		s2.add("java");
		System.out.println(s2); // display as user inserted with unique values
		
		System.out.println("TreeSet : ");
		TreeSet s3 = new TreeSet();
		s3.add("java");
		s3.add("sql");
		s3.add("python");
		s3.add("php");
		s3.add("android");
		//s3.add(null); //
		s3.add("java");
		System.out.println(s3); // display in ascending order
	}

}
