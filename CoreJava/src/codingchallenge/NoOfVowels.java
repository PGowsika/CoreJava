package codingchallenge;

import java.util.Scanner;
public class NoOfVowels {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = scn.nextLine();
		int noofvowels = vowels(input);
		if(noofvowels>0)
			System.out.println("Total no of vowels in string are : " + noofvowels);
		else
			System.out.println("There is no vowels in the given string");
	}

	private static int vowels(String s) {
		int count =0;
		s = s.toLowerCase();
		for(int i= 0; i<s.length();i++)
		{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i' || 
					s.charAt(i) == 'o' || s.charAt(i) == 'u' )
				count++;
		}
		return count;
	}
}
