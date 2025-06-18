package mainPack;

import pack1.A;
import pack1.B;
import pack2.C;

public class PackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA = new A();
		// System.out.println(" a = " +objA.a); // ERROR : the variable has default modifier it is outside of this package
		// System.out.println(" a = " +objA.get_a()); // ERROR : the method has default modifier
		//System.out.println(" a1 = " +objA.a1);
		System.out.println(" a1 = " +objA.get_a1());
		System.out.println();
		
		B objB = new B();
		// System.out.println(" b = " +objA.b); // ERROR : the variable has default modifier
		// System.out.println(" b = " +objA.get_b()); // ERROR : the method has default modifier
		System.out.println(" b1 = " +objB.b1);
		//System.out.println(" b1 = " +objB.get_b1());
		System.out.println();
		
		C objC = new C();
		// System.out.println(" b = " +objA.b); // ERROR : the variable has default modifier
		// System.out.println(" b = " +objA.get_b()); // ERROR : the method has default modifier
		System.out.println(" c1 = " +objC.c1);
		//System.out.println(" c1 = " +objC.get_c1());
		System.out.println();
		
		int sum = objA.get_a1() + objB.get_b1() + objC.get_c1();
		System.out.println("SUM = " + sum);
		
		
	}

}
