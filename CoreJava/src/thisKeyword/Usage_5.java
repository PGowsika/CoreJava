 // Passed as parameter to the constructor
	

package thisKeyword;

public class Usage_5 {
	
	String name ;
	int age ;
	
	Usage_5(){
		//this("Ram", 20);  // used to invoke current class constructor
		System.out.println("Inside default Constructor ");
		name = null ;
		age = 0 ;		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		Usage_5 obj = new Usage_5(this); // Passed as parameter to the constructor
	}
	
	
	Usage_5(String name, int age){
		
		this(); // used to invoke current class constructor
		System.out.println("Inside Parameterized Constructor ");
		//this(); // ERROR : calling constructor using this keyword should be the first statement
		this.age = age; //Using the ‘this’ keyword to refer to current class instance variables.
		this.name = name;
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		//Usage_5 obj = new Usage_5(this);  // Passed as parameter to the constructor
	
	}
	Usage_5(Usage_5 obj){
		System.out.println("Inside copy Constructor ");
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	
	
	void display() {
		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Usage_5 obj = new Usage_5();
		Usage_5 obj = new Usage_5("ram" , 20);
		obj.display();
		
	}


}
