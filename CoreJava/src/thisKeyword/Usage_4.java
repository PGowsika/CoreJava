 // passed as parameter to a method call

package thisKeyword;


public class Usage_4 {

	String name = "Pooja";
	int age = 23;
	
	Usage_4(){
		this("Ram", 20);  // used to invoke current class constructor
		System.out.println("Inside default Constructor ");
		name = null ;
		age = 0 ;		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		//getPerson(this);  // passed as parameter to a method call
	}
	
	
	Usage_4(String name, int age){
		
		//this(); // used to invoke current class constructor
		System.out.println("Inside Parameterized Constructor ");
		//this(); // ERROR : calling constructor using this keyword should be the first statement
		this.age = age; //Using the ‘this’ keyword to refer to current class instance variables.
		this.name = name;
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		getPerson(this);  // passed as parameter to a method call
	}
	
	void getPerson(Usage_4 obj) {
		System.out.println("Inside GetPerson() method : ");
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	
	void display() {
		//getPerson(this)  // passed as parameter to a method call
		//getPerson(); // usual calling
		//this.getPerson(); // this ---> to invoke current object method
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usage_4 obj = new Usage_4();
		//Usage_4 obj = new Usage_4("ram" , 20);
		obj.display();
		
	}

}
