package p1;

import java.util.Objects;

public class Student implements Comparable<Student> { //generics
	private String name;
	private double gpa;
	private int age;

	public Student(String name, double gpa, int age) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.age = age;
	}
	
//	public Student(Student s) {
//		this = s;
//	}
	
	 
	public Student(Student s) { // deep copy constructor
		this.name = s.name;
		this.gpa = s.gpa;
		this.age = s.age;
	}
	
	public Student shallowCopy() { // shallow copy
		return this;
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
	public int hashCode() {
		return Objects.hash(gpa, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(gpa) == Double.doubleToLongBits(other.gpa) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

	@Override
	public int compareTo(Student o) {
//		return this.name.compareTo(o.name);
//		return Double.compare(this.gpa, o.gpa);
		return Integer.compare(this.age, o.age);
		
	}

}
