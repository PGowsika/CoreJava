//this ---> to invoke current object method

package thisKeyword;

import java.util.Scanner;

public class Usage_2 {
	String name = "Pooja";
	int age = 23;
	
	//Using the ‘this’ keyword to refer to current class instance variables.
	Usage_2(String name, int age){
		/*name=name;
		age=age;*/
		System.out.println("Inside Parameterized Constructor ");
		this.age = age;
		this.name = name;
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	
	void getPerson() {
		System.out.println("Inside GetPerson() method : ");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		name = s.next();
		System.out.println("Enter the age : ");
		age = s.nextInt();
	}
	
	void display() {
		//getPerson(); // usual calling
		this.getPerson(); // this ---> to invoke current object method
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usage_2 obj = new Usage_2("Ram", 25);
		obj.display();
		
	}

}
