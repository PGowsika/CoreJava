package comparableInterface;

import java.util.Arrays;

public class ComparableInterface {

	public static void main(String[] args) {
	
		//String arr[] = {"Java" , "Android", "Php", "Sql", "C"};
		Book book[] = {new Book("Java",450), 
					   new Book("Android", 375), 
					   new Book("PhP", 150), 
					   new Book("Sql", 200), 
					   new Book("C", 180)
					   };
				
		Arrays.sort(book);
		
	//	System.out.println(book);
		
		for( Book s : book)
			System.out.println(s);
	}

}
