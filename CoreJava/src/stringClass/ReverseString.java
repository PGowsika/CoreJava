package stringClass;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Java";
		
		char c[] = new char[s.length()];
		int idx=s.length()-1;
		for(int i=0;i<s.length();i++) 
			c[i] = s.charAt(idx--);		
		System.out.println(c);

		String rev = "";
		for(int k=s.length()-1;k>=0;k--)
			rev = rev + s.charAt(k);
		System.out.println("Reverse string : " +rev);
			
	}

}
