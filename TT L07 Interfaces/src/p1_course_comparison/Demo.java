package p1_course_comparison;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		Course c1 = new Course("CSE118", "C+", 4);
		Course c2 = new Course("CSE248", "b", 1);
		Course c3 = new Course("CSE148", "B+", 3);
		
		Course[] arr = {c1, c2, c3};
		
//		Comparator<Course> myComparator = (new Demo()).new MyComparator();
//		Comparator<Course> myComparator = new MyComparator();
		
		// anonymous class: No class name given, but there is a body
//		Comparator<Course> myComparator = new Comparator<>() {
//
//			@Override
//			public int compare(Course o1, Course o2) {
//				return Integer.compare(o1.getCredits(), o2.getCredits());
//			}
//			
//		};
		
		// lambda
//		Comparator<Course> myComparator = (o1, o2) -> Integer.compare(o1.getCredits(), o2.getCredits());
//			return Integer.compare(o1.getCredits(), o2.getCredits()); 
			
			
		
		
		System.out.println("Before sorting-------------------");
		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr, myComparator);
		Arrays.sort(arr, (o1, o2) -> Integer.compare(o1.getCredits(), o2.getCredits()));
		
		System.out.println("After sorting-------------------");
		
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, (o1, o2) -> o1.getLetterGrade().compareTo(o2.getLetterGrade()));
		
		// method 1: ==
		System.out.println(c1 == c2); // false
		
		// method 2: equals()
		System.out.println(c1.equals(c2)); // true
		
		System.out.println(c1.compareTo(c2));
		
		
	}

//	class MyComparator implements Comparator<Course> {
//
//		@Override
//		public int compare(Course o1, Course o2) {
//			return Integer.compare(o1.getCredits(), o2.getCredits());
//		}
//		
//	}
}
