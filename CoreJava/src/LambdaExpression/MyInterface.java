package LambdaExpression;
@FunctionalInterface //only one abstract method is allowed
public interface MyInterface //Functional Interface - single Abstract Method (SAM)
{

	//public void show(); 
//	public void show(int a,int b); //abstract Method 
	//void m1();
	
	public int add(int a, int b);
}
