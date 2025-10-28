package v2_0;

public class Demo {

	public static void main(String[] args) {		
		Course c1 = new Course("CSE118", "B", 3);
		Course c2 = new Course("CSE148", 4);
		Course c3 = new Course("GYM101", "B", 1);
		Course c4 = new Course("MAT142", 4);
		Course c5 = new Course("PHY141", 4);
		
		
		CourseBag theBag = new CourseBag(10);
		theBag.addCourse(c1);
		theBag.addCourse(c2);
		theBag.addCourse(c3);
		theBag.addCourse(c4);
		theBag.addCourse(c5);
		
		PartTimeStudent ps1 = new PartTimeStudent("Joseph", "Smith", 'K', theBag, "CS", 10);
		
//		System.out.println(ps1);
//		System.out.println("Tuition: " + ps1.tuition());
//		System.out.println("Parking Fees: " + ps1.parkingFee(100));
//		System.out.println("GPA: " + ps1.calculateGPA());
		
		ps1.displayTranscriptOnScreen();
	}

}
