package p3_bags;

import java.util.function.UnaryOperator;

public class Student {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}

	public Student(String name) {
		super();
		this.name = name;
	}
	
//	public void curveGpa(double amount) {
//		gpa += amount;
//	}
	
	public void curveGpa(UnaryOperator<Double> unary) {
		gpa = unary.apply(gpa);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
