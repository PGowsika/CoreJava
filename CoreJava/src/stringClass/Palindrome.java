package stringClass;

public class Palindrome {

	public static void main(String[] args) {
		String s= "madam";
		String rev = "";
		for(int k=s.length()-1;k>=0;k--)
			rev = rev + s.charAt(k);
		System.out.println("Reverse string : " +rev);
		if(s.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

}
