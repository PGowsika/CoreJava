package constructor;

public class constructorTypes {
	
	//class variables
	String name;
	int age;
	
	// default constructor
	constructorTypes() {
		System.out.println("Default Constructor");
		name = null;
		age = 0;
	}

	// Parameterized Constructor
	constructorTypes(String name, int age) {
		System.out.println("Parameterized Constructor");
		this.name = name;
		this.age = age;
	}
	
	// Copy Constructor
	constructorTypes(constructorTypes obj)
	{
		name = obj.name;
		age = obj.age;
		System.out.println("Copy Constructor");
	}
	
	

	void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructorTypes c2 = new constructorTypes("Gowsika" , 26);
		c2.display();
		
		constructorTypes c1 = new constructorTypes();
		c1.display();
		
		
		constructorTypes c3 = new constructorTypes(c2);
		c3.display();
		System.out.println("Name : " + c3.name);
		System.out.println("Age : " + c3.age);
		
		

	}

}
