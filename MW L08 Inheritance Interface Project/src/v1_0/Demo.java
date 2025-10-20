package v1_0;

public class Demo {

	public static void main(String[] args) {
		Course c1 = new Course("CSE118", "A", 3, true);
		Course c2 = new Course("ENG101", "A", 3, true);
		Course c3 = new Course("MAT102", "A", 4, true);
		Course c4 = new Course("PHY131", "A", 4, true);
		Course c5 = new Course("CSE148", null, 4, false);
		Course c6 = new Course("MAT141", null, 4, false);
		Course c7 = new Course("PHY132", null, 4, false);
		 c5.setLetterGrade("F");
		 c5.setHasGrade(true);
		 c6.setLetterGrade("F");
		 c6.setHasGrade(true);
		 c7.setLetterGrade("F");
		 c7.setHasGrade(true);
		
		CourseBag bag1 = new CourseBag(10);
		bag1.addCourse(c1);
		bag1.addCourse(c2);
		bag1.addCourse(c3);
		bag1.addCourse(c4);
		bag1.addCourse(c5);
		bag1.addCourse(c6);
		bag1.addCourse(c7);
//		System.out.println(bag1.calculateGPA());
		
		Person pts1 = new PartTimeStudent("PAF", "PAL", 'A', "CS", 10, bag1);
		System.out.println(pts1);
		System.out.println(((PartTimeStudent)pts1).calculateGPA());
		System.out.println("Tuition: " + ((PartTimeStudent)pts1).tuition());
		System.out.println("Parking fees: " + pts1.parkingFee(100));
		
	}

}
