package p1;

import java.util.Arrays;

public class DemoBook {

	public static void main(String[] args) {
		Book b1 = new Book("joe", 18.99, 2025);
		Book b2 = new Book("Ay", 9.00, 2017);
		Book b3 = new Book("Ze", 8.99, 2015);
		Book b4 = new Book("Oey", 19.00, 2005);
		
		Book[] arr = {b1, b2, b3, b4};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(arr));
		
		
		
//		Book b3 = b1; // shallow copy: the address is copied
////		Book b4 = b2; // shallow copy: the address is copied
//		
////		Book b5 = new Book(b1.getTitle(), b1.getPrice(), b1.getYear()); // deep copy of b1
//		b1 = null;
//		System.out.println(b1 == b3);
//		System.out.println(b2.equals(b4));
//		System.out.println(b5 == b1);
		
//		Book b3 = new Book(b1); // deep copy
//		Book b4 = b1; // shallow copy
//		
//		System.out.println(b1.equals(new Book(b1)));
//		System.out.println(b1 == b2);
		
//		System.out.println(b1.compareTo(b2));
	}

}
