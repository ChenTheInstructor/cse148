package p1;

public abstract class Student extends Person implements Calculator {
	private double gpa;

	public Student(String name, double gpa) {
		super(name);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name: " + getName() + ", ID: " + getId() + ", GPA=" + gpa + "]";
	}

//	@Override
//	public double calculateParkingFees() {
//		return 50.0;
//	}

}
