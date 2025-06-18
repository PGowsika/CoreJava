package collection;

import java.util.HashSet;
import java.util.Set;

public class SetWork {

	public static void main(String[] args) {
		Student s1 = new Student("Arun", 40, 20);
		System.out.println(s1.hashCode());
		Student s3 = new Student("Arun", 40, 20);
		System.out.println(s3.hashCode());
		Student s2 = new Student("Vivek", 43, 21);
		System.out.println(s2.hashCode());
		
		
		
		Set s = new HashSet();
		s.add(s1);
		System.out.println(s1.hashCode());
		s.add(s3);
		System.out.println(s3.hashCode());
		s.add(s2);
		System.out.println(s2.hashCode());
		
		
		
		System.out.println(s);
	}

}
