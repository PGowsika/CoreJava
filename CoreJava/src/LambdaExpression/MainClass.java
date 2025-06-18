package LambdaExpression;

//--Using lambda expression--- 
public class MainClass
{	
	public static void main(String[] args)
	{
		//MyInterface obj = () ->{System.out.println("Example of Lambda expression");};
		//obj.show();
		//MyInterface obj1 = (a,b) ->{System.out.println(a+b);};
		//obj1.show(10,20);
		MyInterface obj1 = (a,b) ->{return a+b;};
		int x = obj1.add(10,20);
		System.out.println(x);
		
	}
}
// -------- Normal interface method access -----
/*public class MainClass implements MyInterface{
	@Override
	public void show() 
	{
		System.out.println("MyInterface is a functional Interface");
	}
	public static void main(String[] args) 
	{
		MyInterface obj = new MainClass();
		obj.show();
	}

}*/

// -----Without implements and access the Interface methods as "ANONYMOUS INNER CLASS" -----
/*public class MainClass
{	
	public static void main(String[] args)
	{
		MyInterface obj = new MyInterface() 
		{
			@Override
			public void show() {
				System.out.println("MyInterface is a functional Interface");		
			}

			@Override
			public void m1() {
				System.out.println("MyInterface m1 method");
				
			};
		};
		obj.show();
		//obj.m1();

	}
}*/



