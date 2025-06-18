package inheritance;


class Animal // Super class  or Base class or Parent class
{
	void sound()
	{
		System.out.println("Animal Makes Sound");
	}
}

class Dog extends Animal // subclass or Derived class or Child class
{
	void makeSound()
	{
		sound();
		System.out.println("Dogs are Barking");
	}
}



public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		d.makeSound();
	}

}
