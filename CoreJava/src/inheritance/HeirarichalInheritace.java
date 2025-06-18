package inheritance;

class Animalss // Super class  or Base class or Parent class
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

class DomesticAnimals extends Animalss// subclass or Derived class or Child class-1
{
	void eating()
	{
		eat();
		sound();
		System.out.println("Type : " + type);
		System.out.println("Vegetarian occationally non-vegetarian");
		System.out.println();
		WildAnimals w = new WildAnimals();
		w.eating();

	}
}

class WildAnimals extends Animalss // subclass or Derived class or Child class-2
{
	void eating()
	{
		type = "Puppy";
		eat();
		sound();
		System.out.println("Type : " + type);
		System.out.println("Vegetarian");
		System.out.println(" ");
	}
}



public class HeirarichalInheritace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildAnimals w = new WildAnimals();
		w.eating();
		DomesticAnimals d = new DomesticAnimals();
		d.eating();

	}

}
