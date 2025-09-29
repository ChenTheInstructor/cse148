package p1_student;

public class FullTimeStudent extends Student {
	
	private int semesterCourses;
	private static final double FLAT_RATE = 4500.0;

	public FullTimeStudent(String name, int id, int semesterCourses) {
		super(name, id); // super class constructor must always be the first line
		this.semesterCourses = semesterCourses;
	}

	public void showInfo() {
		System.out.println(super.toString());
		System.out.println("Full Time, Courses: " + semesterCourses);
		System.out.print("Flat Tuition: " + FLAT_RATE);
	}

	public double calculateTuition() {
		return FLAT_RATE;
	}

	@Override
	public String toString() {
		return "FullTimeStrudent [" + super.toString() + ", semesterCourses=" + semesterCourses + "]";
	}

}
