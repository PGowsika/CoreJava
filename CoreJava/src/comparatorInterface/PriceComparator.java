package comparatorInterface;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.price>o2.price)
			return 1;
		else if(o1.price == o2.price)
			return 0;
		else
			return -1;
		
	}

}
