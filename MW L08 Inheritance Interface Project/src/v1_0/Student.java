package v1_0;

public abstract class Student extends Person implements TuitionPayable, GPAComputable {
	private String major;
	private int credits;
	private CourseBag theBag;

	public Student(Name name, String major, int credits, CourseBag theBag) {
		super(name);
		this.major = major;
		this.credits = credits;
		this.theBag = theBag;
	}
	
	public Student(String fn, String ln, char mid, String major, int credits, CourseBag theBag) {
		super(fn, ln, mid);
		this.major = major;
		this.credits = credits;
		this.theBag = theBag;
	}
	
	public Student(String fn, String ln, String major, int credits, CourseBag theBag) {
		super(fn, ln);
		this.major = major;
		this.credits = credits;
		this.theBag = theBag;
	}

	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public CourseBag getTheBag() {
		return theBag;
	}

	public void setTheBag(CourseBag theBag) {
		this.theBag = theBag;
	}

	@Override
	public double calculateGPA() {
		return theBag.calculateGPA();
	}

	@Override
	public String toString() {
		return "\n[" + super.toString() + "\nmajor=" + major + ", theBag=" + theBag + "]";
	}

	
}
