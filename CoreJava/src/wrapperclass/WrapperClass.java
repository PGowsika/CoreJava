package wrapperclass;

public class WrapperClass {

	int z;
	Integer z1;
	boolean b;
	Boolean b1;
	public static void main(String[] args) {
		int a = 20;
		int b = 5;
		
		System.out.println("----1.Converting Primitive type to String----");
		String s1 = Integer.toString(a);
		String s2 = Integer.toString(b);
		System.out.println("s1 = " + s1 + "\ts2 = " + s2 + "\ns1 + s2 = " + (s1 + s2));
		System.out.println();
		
		
		System.out.println("----2.Converting Primitive type to object----");
		Integer IntVal1 = new Integer(12);
		Integer IntVal2 = new Integer(24);
		System.out.println("IntVal1 = " + IntVal1 +"\tIntVal2 = "+ IntVal2 +"\nIntVal1+Intval2 = " + (IntVal1 + IntVal2));
		System.out.println();
		
		System.out.println("----3.Converting Wrapper object to primitive type----");
		int i = IntVal1; //.intValue();
		int j = IntVal2.intValue();
		System.out.println("i = " + i + "  \tj = " + j + " \ni + j = " + (i+j));
		System.out.println();
		
		System.out.println("----4.Converting string to wrapper calss object---");
		IntVal1 = Integer.valueOf(s1);
		IntVal2 = Integer.valueOf(s2);
		System.out.println("IntVal1 = " + IntVal1 +"\tIntVal2 = "+ IntVal2 +"\nIntVal1*Intval2 = " + (IntVal1 * IntVal2));
		System.out.println();
		
		System.out.println("----5.Converting String to Primitive Type----");
		int x = Integer.parseInt(s1);
		int y = Integer.parseInt(s2);
		System.out.println("x = " +x + "\ty = " + y + "\nx/y = " + (x/y));
		System.out.println();
		
		Integer p =25; // Autoboxing [implicit]
		int val = (int)p; // Auto-Unboxing [explicit]
		System.out.println("Autoboxing" );
		System.out.println("p = " + p);
		System.out.println("Auto - Unboxing");
		System.out.println("val = " + val);
		System.out.println();
		
		System.out.println("Default values");
		WrapperClass w = new WrapperClass();
		System.out.println("int(z) = "+ w.z);
		System.out.println("Integer(z1) = "+ w.z1);
		System.out.println("boolean(b) = "+ w.b);
		System.out.println("Boolean(b1) = "+ w.b1);
	}

}
