package inheritance;

class Animals // Super class  or Base class or Parent class
{
	String type;
	void eat() {
		System.out.println("Animal can eat");
	}
	void sound()
	{
		System.out.println("Animal Makes Sound");
	}
}

class DomesticAnimal extends Animals// subclass or Derived class or Child class-1
{
	void eating()
	{
		eat();
		System.out.println("Type : " + type);
		System.out.println("Vegetarian occationally non-vegetarian");
	}
}

class Dogs extends DomesticAnimal // subclass or Derived class or Child class-2
{
	void makeSound()
	{
		type = "Puppy";
		sound();
		System.out.println("Type : " + type);
		System.out.println("Dogs are Barking");
		eating();
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs d = new Dogs();
		d.makeSound();
	}

}
