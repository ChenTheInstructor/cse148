package p1_comparable_comparator;

import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("JoseA", 3.5);
		Student s2 = new Student("JoseB", 3.6);
		// s1 and s2 contain the address of objects, not the objects themselves
		// s1 and s2 are the only thing we use to access objects
//		s2 = s1;
//		s1 = null;
//		System.out.println(s1.toString());
		
		// == comparing addresses
		System.out.println(s1 == s2);
		
//		// equals(): the inherited default version is equivalent to ==
//		System.out.println(s1.equals(s2));
//		
		
		// you may create your own version of equals() to compare content of two objects
		System.out.println(s1.equals(s2)); // comparing equality of content
		
		// what if I need to compare the size of two objects.Based on Comparable written internally
		System.out.println(s1.compareTo(s2)); // by GPA
		
		// use Comparator externally to provide alternative order
//		Comparator<Student> myComparator = (sn1, sn2) -> sn1.getName().compareTo(sn2.getName());
		
		// alternative implementation of Comparator<Studernt>
//		Comparator<Student> myComparator = new Comparator<>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//			
//		};
		
		System.out.println((new MyComparator()).compare(s1, s2)); // by name, an alternative order
	}
	
	

}
