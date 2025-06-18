package stringClass;

import java.util.Scanner;

public class StringOccurance {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = scn.next();
		String p1="";
		for(int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			if(p1.indexOf(c) != -1)
				continue;
			p1+=c;
			int k = getcount(s1,c);
			System.out.println(c + " = " +k);
		}
		

	}

	private static int getcount(String s1, char c) {
		String r=s1.replace(c+"", "");
		
		return s1.length()-r.length();
	}

}
