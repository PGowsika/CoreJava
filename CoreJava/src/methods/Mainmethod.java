package methods;

import java.util.Scanner;

public class Mainmethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessorMutator obj = new AccessorMutator();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name");
		obj.setName(s.next());
		System.out.println("Enter Age");
		obj.setAge(s.nextInt());
		System.out.println("Name : " + obj.getName());
		System.out.println("Age : " + obj.getAge());
		
	}

}
