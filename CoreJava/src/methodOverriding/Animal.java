package methodOverriding;

public class Animal  // Superclass
{
	
	public void moving() {
		System.out.println("Animals are moving");
	}

}
class Dog extends Animal  //Subclass -1
{
	@Override
	public void moving() {
		//super.moving();
		System.out.println("Dogs are Moving");
	}
}

class Snake extends Animal  //Subclass -1
{
	@Override
	public void moving() {
		System.out.println("Snakes are Moving");
	}
}
