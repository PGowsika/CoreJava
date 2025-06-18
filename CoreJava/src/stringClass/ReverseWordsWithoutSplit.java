package stringClass;

import java.util.Scanner;

public class ReverseWordsWithoutSplit {
    public static void main(String[] args) {
        
      //  String input = "i am a developer";
    	Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = scn.nextLine();
        String reversed = reverseWords(input);
        System.out.println(reversed);
    }

    public static String reverseWords(String input) {
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

