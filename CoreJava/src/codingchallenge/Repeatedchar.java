package codingchallenge;

import java.util.Scanner;
public class Repeatedchar {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = scn.nextLine();
		String p1="";
		int j=0;
		System.out.println();
		for(int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			if(p1.indexOf(c) != -1)
				continue;
			p1+=c;
			int k = getcount(s1,c);
			if(k>1) 
				System.out.println(c + " = " +k);
			else
				j++;
		}
		if(j == s1.length())
		{
			System.out.println("No repeating characters in the string");
		}
	}

	private static int getcount(String s1, char c)
	{
		String r=s1.replace(c+"", "");
		return s1.length()-r.length();
	}
}
