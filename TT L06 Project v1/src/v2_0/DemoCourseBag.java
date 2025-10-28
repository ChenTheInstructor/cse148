package v2_0;

import java.util.Arrays;

public class DemoCourseBag {

	public static void main(String[] args) {
		Course c1 = new Course("CSE118", "A", 3);
		Course c2 = new Course("MAT141", "C", 4);
		Course c3 = new Course("CSE148", "B", 4);
		
		CourseBag theBag = new CourseBag(1000);
		theBag.addCourse(c1);
		theBag.addCourse(c2);
		theBag.addCourse(c3);
		
		System.out.println(theBag);
		
		System.out.println(theBag.calculateGPA());
		
		System.out.println("Course(s) found: ");
		Course[] arr = theBag.search((course) -> course.getTITLE().equals("CSE148"));
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Course(s) found: ");
		arr = theBag.search((course) -> course.getCREDITS() == 4);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Course(s) found: ");
		arr = theBag.search((course) -> course.getLetterGrade() != null && course.getLetterGrade().compareTo("B") <= 0);
		System.out.println(Arrays.toString(arr));
	}

}
