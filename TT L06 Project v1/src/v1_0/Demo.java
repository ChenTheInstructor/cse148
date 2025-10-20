package v1_0;

public class Demo {

	public static void main(String[] args) {		
		Course c1 = new Course("CSE118", "B", 3);
		Course c2 = new Course("CSE148", "X", 4);
		Course c3 = new Course("GYM101", "B", 1);
		
		CourseBag theBag = new CourseBag(10);
		theBag.addCourse(c1);
		theBag.addCourse(c2);
		theBag.addCourse(c3);
		
		PartTimeStudent ps1 = new PartTimeStudent("AP", "AP", 'A', theBag, "CS", 10);
		
		System.out.println(ps1);
		System.out.println("Tuition: " + ps1.tuition());
		System.out.println("Parking Fees: " + ps1.parkingFee(100));
		System.out.println("GPA: " + ps1.calculateGPA());
	}

}
