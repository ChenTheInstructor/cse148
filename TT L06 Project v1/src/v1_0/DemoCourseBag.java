package v1_0;

public class DemoCourseBag {

	public static void main(String[] args) {
		Course c1 = new Course("CSE118", "A", 3);
		Course c2 = new Course("MAT141", "A", 4);
		Course c3 = new Course("CSE148", 4);
		
		CourseBag theBag = new CourseBag(1000);
		theBag.addCourse(c1);
		theBag.addCourse(c2);
		theBag.addCourse(c3);
		
		System.out.println(theBag);
		
		System.out.println(theBag.calculateGPA());
	}

}
