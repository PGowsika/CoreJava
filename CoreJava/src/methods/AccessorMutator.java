package methods;

public class AccessorMutator {
	
	private String name;
	private int age;
	
	
	 String getName() {
		return name;
	}


	 void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
