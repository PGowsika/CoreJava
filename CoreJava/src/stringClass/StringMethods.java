package stringClass;

public class StringMethods {

	public static void main(String[] args) {
		String s1 ="python ";
		String s2 ="Java is a object oriented language";
		String s3 = "  PYTHON";
		String s4 = "JAVA";
		String s5 = "";
		System.out.println("Returns the character at 1th index : \n" +s1.charAt(1));
		System.out.println("Compares two string lexicographically : \n" +s1.compareTo(s2));
		System.out.println("Compares two string lexicographically, ignoring case considerations :\n " + s1.compareToIgnoreCase(s2));
		System.out.println("Returns true if string contains contains the given string : \n"+ s1.contains("teh"));
		System.out.println("Return true if string starts with this prefix : \n" + s2.startsWith("p"));
		System.out.println("Return true if string starts with this prefix with offset : \n" + s2.startsWith("o", 10));
		System.out.println("Return true if string ends with this suffix : \n" + s2.endsWith("e"));
		System.out.println("Compares this string to the specified object : \n" + s1.equals(s3));
		System.out.println("Compares string to another string, ignoring case considerations : \n" + s1.equalsIgnoreCase(s3));
		System.out.println("converts a string into an array of bytes :");
		byte b[] = s4.getBytes();
		for(byte i : b) 
			System.out.println(i);
		
		
		System.out.println("copies characters from a string to a char array.");
		char c[] = new char[s4.length()];
		s4.getChars(0, s4.length(), c, 0);
		for(char i : c) 
			System.out.println(i);
		
		System.out.println("toCharArray() method returns a new char array representing the contents of the string");
		char c1[] = s1.toCharArray();
		for(char i : c1) 
			System.out.println(i);
		System.out.println("isEmpty() checks whether a string is empty or not :\n" + s5.isEmpty());
		System.out.println("length() returns the length of a specified string : \n" +s1.length());
		System.out.println("replace() searches a string for a specified character, and returns a new string where the specified character(s) are replaced : \n" + s2.replace("a", "s"));
		System.out.println("substring() returns a substring from the string : \n" + s2.substring(5, 12));
		System.out.println("lowercase : \n" + s3.toLowerCase());
		System.out.println("Uppercase : \n" + s2.toUpperCase());
		System.out.println("The trim() method removes whitespace from both ends of a string \n"+ (s1 + s3.trim()));
		System.out.println("The concat() method appends (concatenate) a string to the end of another string :\n" +s1.concat(s3));
		
	}

}
