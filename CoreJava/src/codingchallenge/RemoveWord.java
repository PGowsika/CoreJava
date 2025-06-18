package codingchallenge;

import java.util.Scanner;

public class RemoveWord {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = scn.nextLine();
		System.out.println("Enter the word to remove: ");
		String input = scn.nextLine();
		System.out.println(s.replace(input, ""));

	}

}
