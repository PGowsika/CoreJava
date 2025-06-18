package codingchallenge;

import java.util.Scanner;
public class DispalyNum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the alphanumeric String : ");
		String alphaNum = scn.next();
		String num ="";
		int i=0;
		for(char c : alphaNum.toCharArray())
		{
			if(Character.isDigit(c)) {
				String s=Character.toString(c);
				num = num.concat(s);	
			}	
		}
		if(num.isEmpty())
			System.out.println("No digits in the given string");
		System.out.println("Only digits in given string : " + num);
	}
}
