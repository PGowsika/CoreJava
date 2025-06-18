package singletonClass;

public class Singleton {

	
	// create private static object
	private static Singleton obj;
	
	//Create a private Constructor
	private Singleton()
	{
		
	}
	
	// create factory method to check instance is null or not
	public static Singleton getInsatance() {
		if(obj==null) {
			obj = new Singleton();
		}
		return obj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton obj1 =Singleton.getInsatance();
		Singleton obj2 =Singleton.getInsatance();
		Singleton obj3 =Singleton.getInsatance();
		System.out.println("obj 1 :" + obj1);
		System.out.println("obj 2 :" + obj2);
		System.out.println("obj 3 :" + obj3);

	}

}
