package p7_quiz_review;

import java.util.Objects;

public class Student extends Person {
	private double gpa;

	public Student(String name, double gpa) {
		super(name);
		this.gpa = gpa;
	}

	public Student(String name) {
		super(name);
	}
	
	public Student(Student s) {
		super(new Person((Person)s));
		this.gpa = s.gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "[" + super.toString() + ", gpa=" + gpa + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(gpa);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(gpa) == Double.doubleToLongBits(other.gpa);
	}
	
	
	
}
