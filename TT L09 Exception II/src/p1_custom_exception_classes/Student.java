package p1_custom_exception_classes;

public class Student {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		if (gpa > 4.0 || gpa < 0.0) {
			try {
				throw new InvalidGPAException("INVALID GPA!");
			} catch (InvalidGPAException e) {
				System.out.println(e.getMessage());
				this.gpa = 0.0;
			}
		} else {
			this.gpa = gpa;
		}
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
		if (gpa > 4.0 || gpa < 0.0) {
			try {
				throw new InvalidGPAException("Invalid GPA entered.");
			} catch (InvalidGPAException e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		} else {
			this.gpa = gpa;
		}

//		if (gpa < 0.0 || gpa > 4.0) {
//			try {
//				throw new InvalidGPAException("The GPA entered is invalid!");
//			} catch (Exception e) {
		////				e.printStackTrace();
//				System.out.println("---------------");
//				System.out.println(e.getMessage());
//				System.out.println("---------------");
//			}
//		} else {
//			this.gpa = gpa;
//		}

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
