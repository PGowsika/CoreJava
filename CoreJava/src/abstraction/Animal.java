package abstraction;

public abstract class Animal {
	//int a;
	abstract void makeSound();
	public Animal() {
		System.out.println("Inside Animal() constructor");
	}
	void display(int a) {
		System.out.println("Animals are moving " + a);
	}
}

class dog extends Animal{

	@Override
	void makeSound() {
		System.out.println("barking");
		
	}
	
}