package codingchallenge;

import java.util.Scanner;
public class UpperLowerCase {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String string = scn.next();
		char ch[] = string.toCharArray();
		for(int i = 0; i < ch.length; i++)
		{
		      if(ch[i] >= 65 && ch[i] <= 90)
		         ch[i] = (char) (ch[i] + 32);
		      else 
		    	  ch[i] = (char) (ch[i] - 32);
		}
		System.out.println(ch);
	}
}
