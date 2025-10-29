package v1_0;

import java.util.Arrays;

public class DemoCourseBag {

	public static void main(String[] args) {
		Course c1 = new Course("CSE118", "A", 3, true);
		Course c2 = new Course("PHY132", "B", 4, true);
		Course c3 = new Course("CSE218", "C", 3, true);
		Course c4 = new Course("CSE148", "F", 3, true);
		Course c5 = new Course("MAT102", "A", 3, true);
		Course c6 = new Course("CHE231", "F", 4, true);
		Course c7 = new Course("CSE248", "C+", 3, true);
		
		CourseBag theBag = new CourseBag();
		theBag.addCourse(c1);
		theBag.addCourse(c2);
		theBag.addCourse(c3);
		theBag.addCourse(c4);
		theBag.addCourse(c5);
		theBag.addCourse(c6);
		theBag.addCourse(c7);

		Course[] matches = theBag.search((course) -> course.getTITLE().substring(0,3).equals("CSE"));
		System.out.println(Arrays.toString(matches));
		
	}

}
