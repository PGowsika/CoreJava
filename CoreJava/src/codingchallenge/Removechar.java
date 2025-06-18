package codingchallenge;

import java.util.Scanner;

public class Removechar {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = scn.nextLine();
		System.out.println(s.substring(1, s.length()-1));

	}

}
