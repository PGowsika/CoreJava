package static_keyword;

public class Test {
	// Java program to demonstrate use of static blocks

	
	    // static variable
	    static int a = 10;
	    static int b;
	    
	    static void m1() {
	    	System.out.println("Value of b : "+b);
	    }
	    // static block
	    static {
	    	 System.out.println("Static block initialized  111.");
	    }
	    
	    static {
	        System.out.println("Static block initialized.");
	        b = a * 4;
	        System.out.println("Value of b : "+b);
	    }
	   static class job{
		   static void m3() {
			   new Test.job().m2();
			   System.out.println("hello");
			  // new Test.job().m2();
		   }
		   void m2() {
			   System.out.println("welcome");
			   m3();
		   }
	   }

	    public static void main(String[] args)
	    {
	    	//b=50;
	    	Test n = new Test();
	    	//Test.m1();
	    	// Calling static class---> static method
	    	Test.job.m3();
	    	
	    	//Calling static class---> non-static method
	    	new Test.job().m2();
	    	
	      /* System.out.println("from main");
	       System.out.println("Value of a : "+a);
	       System.out.println("Value of b : "+b);*/
	    }
	

}
