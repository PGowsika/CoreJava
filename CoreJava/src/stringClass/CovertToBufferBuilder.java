package stringClass;

public class CovertToBufferBuilder {

	public static void main(String[] args) {
		//String s = "Java";
		StringBuffer sbf = new StringBuffer("Java");
		StringBuilder sb = new StringBuilder("hello ");
		sb.append(sbf);
		String s1 = new String(sb);
		String s2 = new String(sbf);
		//System.out.println("String s = " + s);
		System.out.println("StringBuilder sbf = " +sbf);
		System.out.println("StringBuilder sb = " + sb);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(sb.append(" program"));
		System.out.println();
		
		StringBuffer sbf1 = new StringBuffer("Java");
		String Ss = sbf1.toString();
		StringBuilder sb1 = new StringBuilder(Ss);
		System.out.println(sbf1);
		System.out.println(Ss);
		System.out.println(sb1);
		
	}

}
