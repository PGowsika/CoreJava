 // used to invoke current class constructor

package thisKeyword;

import java.util.Scanner;

public class Usage_3 {
	String name = "Pooja";
	int age = 23;
	
	Usage_3(){
		//this("Ram", 20);  // used to invoke current class constructor
		System.out.println("Inside default Constructor ");
		name = null ;
		age = 0 ;		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	
	
	Usage_3(String name, int age){
		
		this(); // used to invoke current class constructor
		System.out.println("Inside Parameterized Constructor ");
		//this(); // ERROR : calling constructor using this keyword should be the first statement
		this.age = age; //Using the ‘this’ keyword to refer to current class instance variables.
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
		//this.getPerson(); // this ---> to invoke current object method
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Usage_3 obj = new Usage_3();
		Usage_3 obj = new Usage_3("ram" , 20);
		obj.display();
		
	}
}
