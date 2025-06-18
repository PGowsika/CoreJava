package comparableInterface;

public class Book implements Comparable{

	String Bookname;
	int pages;
	
	
	@Override
	public String toString() {
		return "Book [Bookname=" + Bookname + ", pages=" + pages + "]";
	}


	public Book(String bookname, int pages) {
		
		this.Bookname = bookname;
		this.pages = pages;
	}


	@Override
	public int compareTo(Object o) {
		Book b1 = (Book)o; //  Downcasting
		
		//based on page sorting
		return this.pages - b1.pages;
		
		// based on length of string
		//return this.Bookname.length() - b1.Bookname.length();
		 
		//based on alphabetical order
		//return this.Bookname.compareTo(b1.Bookname);
	}
	

}
