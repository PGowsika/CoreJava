package comparatorInterface;

import java.util.Comparator;

public class Book {

	String Bookname;
	int pages;
	double price;
	
	
	public Book(String bookname, int pages, double price) {
		
		this.Bookname = bookname;
		this.pages = pages;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [Bookname=" + Bookname + ", pages=" + pages + ", price=" + price + "]";
	}


	
}


	

