package finalModifier;

//final public class FinalA
public class FinalA {
	final int var = 100;
	
	final void display() {
		System.out.println("display method in FinalA");
	}
}

class FinalB extends FinalA // if superclass is a final class then it can't be able to extend by its class
{
	void increment() {
		// i+1; // values of final variable cannot be modified
	}
	/*
	 * final method in superclass cannot be override in subclass
	@Override  
	void display() 
	{
		System.out.println("display method in FinalA");
	}*/
}
