package p1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Bag bag1 = new Bag(100);
		
	
		Student s1 = new Student("A", 2.5);
		bag1.insert(s1);
		System.out.println("The bag content: ");
		bag1.display();
		System.out.println("Size: " + bag1.size());
		System.out.println("\n--------------------");
		Student s2 = new Student("B", 3.5);
		bag1.insert(s2);
		System.out.println("The bag content: ");
		bag1.display();
		System.out.println("Size: " + bag1.size());
		System.out.println("\n--------------------");
		Student s3 = new Student("C", 1.5);
		bag1.insert(s3);
		System.out.println("The bag content: ");
		bag1.display();System.out.println("Size: " + bag1.size());
		System.out.println("\n\n\nSearching result: ");
		System.out.println(bag1.findByGPA(4.5));
		
		System.out.println("Delete B:");
		 bag1.removeByName("B");
		 bag1.display();
	}

}
