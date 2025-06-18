package stringBuffer;

public class AppendMethod {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		System.out.println("before append : " + sb);
		System.out.println(sb.hashCode());
		sb.append(" developer");
		System.out.println("After append : " + sb);
		System.out.println(sb.hashCode());
		System.out.println();
		
		String s = new String("Java");
		System.out.println("before concat : " + s);
		System.out.println(s.hashCode());
		s.concat(" developer");
		System.out.println("After concat : " + s);
		System.out.println(s.hashCode());
		s=s.concat(" Hello");
		System.out.println("After concat : " + s);
		System.out.println(s.hashCode());

	}

}
