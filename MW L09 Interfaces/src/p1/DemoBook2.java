package p1;

import java.util.Arrays;
import java.util.Comparator;

public class DemoBook2 {

	public static void main(String[] args) {
		Book b1 = new Book("joe", 18.99, 2025);
		Book b2 = new Book("Ay", 9.00, 2017);
		Book b3 = new Book("Ze", 8.99, 2015);
		Book b4 = new Book("Oey", 19.00, 2005);
		
		Book[] arr = {b1, b2, b3, b4};
		System.out.println("The original array: ");
		System.out.println(Arrays.toString(arr));
//		Comparator myComparator = new BookComparator();
		Comparator myComparator = new InnerComparator();
		Arrays.sort(arr, myComparator);
		System.out.println("The sorted array: ");
		System.out.println(Arrays.toString(arr));
		
	}
	// private inner class
	private static class InnerComparator implements Comparator<Book> {

		@Override
		public int compare(Book o1, Book o2) {
//			return Integer.compare(o1.getYear(), o2.getYear());
			return o1.getTitle().compareTo(o2.getTitle());
		}
		
	}
}
