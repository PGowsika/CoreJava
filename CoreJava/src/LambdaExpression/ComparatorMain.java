package LambdaExpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



public class ComparatorMain {



	public static void main(String[] args) {

		
		Book book[] = {new Book("Java",450,250.0), 
				   new Book("Android", 375,168.0), 
				   new Book("PhP", 150,125.0), 
				   new Book("Sql", 200,650.0), 
				   new Book("C", 180,360.0)
				   };
		
					/*
					 * Scanner scn = new Scanner(System.in);
					 * System.out.println(" Sorting Based on .........."); String input =
					 * scn.next();
					 * 
					 * if(input.equalsIgnoreCase("Price")) Arrays.sort(book, new PriceComparator());
					 * if(input.equalsIgnoreCase("Page")) Arrays.sort(book, new PageComparator());
					 * if(input.equalsIgnoreCase("bookname")) Arrays.sort(book, new
					 * NameComparator());
					 * 
					 * 
					 * 
					 * 
					 * for( Book s : book) System.out.println(s);
					 * 
					 */
		//System.out.println(); 
		System.out.println("Using anonymus Inner calss");
		Arrays.sort(book, new Comparator<Book>()
				{
					@Override 
					public int compare(Book o1, Book o2) {
						return o1.pages- o2.pages; 
						} 
				}
		);
					  
					  for( Book s : book) System.out.println(s);
					 
		 
		 System.out.println("Using Lambda expression");
		 Arrays.sort(book, ( o1, o2)-> {return o1.Bookname.compareTo(o2.Bookname);}
			);
			
		 for( Book s : book)
				System.out.println(s);
	}
	
	

}



