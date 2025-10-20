package v1_0;

public abstract class Student extends Person implements TuitionPayable, GPAComputable {
	private CourseBag theBag;
	private String major;

	public Student(Name name, CourseBag theBag, String major) {
		super(name);
		this.theBag = theBag;
		this.major = major;
	}

	public Student(String fn, String ln, char mid, CourseBag theBag, String major) {
		super(fn, ln, mid);
		this.theBag = theBag;
		this.major = major;
	}

	public Student(String fn, String ln, CourseBag theBag, String major) {
		super(fn, ln);
		this.theBag = theBag;
		this.major = major;
	}

	public CourseBag getTheBag() {
		return theBag;
	}

	public void setTheBag(CourseBag theBag) {
		this.theBag = theBag;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public double calculateGPA() {
		return theBag.calculateGPA();
	}

	@Override
	public String toString() {
		return "\n[" + super.toString() + ", theBag=" + theBag + ", major=" + major + "]";
	}

}
