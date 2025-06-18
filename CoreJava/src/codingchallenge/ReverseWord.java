package codingchallenge;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String st = scn.nextLine();
		String newString=Reverse(st);
		System.out.println(newString);
	}

    public static String Reverse(String input) {
        StringBuilder result = new StringBuilder();
        int end = input.length() - 1;
        int start;

        while (end >= 0) 
        {
            while (end >= 0 && input.charAt(end) == ' ')
            {
                end--;
            }       
            start = end;
            while (start >= 0 && input.charAt(start) != ' ') 
            {
                start--;
            }
            result.append(input, start + 1, end + 1).append(" ");
            end = start - 1;
        }

        return result.toString().substring(0, result.length() - 1);
    }
		    
		
}
	
		