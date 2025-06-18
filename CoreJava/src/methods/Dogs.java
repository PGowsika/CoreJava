package methods;

public class Dogs {
	// Class variable (state)
	String name;
	String color;
	double price;
	
	// class methods (behavior)
	void barking()  // default method
	{
		System.out.println("Dog barking");
	}
	public void fetching() // public Method without return type
	{
		System.out.println("Fetching Foods");
	}
	
	double price() //default method with return type
	{
		price = 15000.0;
		return price;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs obj = new Dogs();
		obj.name = "Puppy";
		new Dogs().color = "Brown";
		System.out.println("Dog name : " + obj.name );
		System.out.println("Dog color : " + obj.color );
		System.out.print("Dog price : ");
		System.out.println(new Dogs().price = 10000.00);
		
		obj.barking();
		new Dogs().fetching();
		
		double price = obj.price();
		System.out.println("Price :  " + price);
	}

}
