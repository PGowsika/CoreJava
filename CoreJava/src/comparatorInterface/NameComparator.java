package comparatorInterface;

import java.util.Comparator;

public class NameComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.Bookname.compareTo(o2.Bookname);
		
		
	}
}
