// USED TO GET THE CURRENT OBJECT

package thisKeyword;

public class Usage_1 {

	String name = "Pooja";
	int age = 23;
	
	//Using the ‘this’ keyword to refer to current class instance variables.
	Usage_1(String name, int age){
		//name=name;
		//age=age;
		this.age = age;
		this.name = name;
	}
	
	void display() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usage_1 obj = new Usage_1("Ram", 25);
		obj.display();
	}

}
