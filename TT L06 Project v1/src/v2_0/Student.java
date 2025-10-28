package v2_0;

public abstract class Student extends Person implements TuitionPayable, GPAComputable, Configurable {
	private CourseBag theBag;
	private String major;
	private int credits;

	public Student(Name name, CourseBag theBag, String major, int credits) {
		super(name);
		this.theBag = theBag;
		this.major = major;
		this.credits = credits;
	}

	public Student(String fn, String ln, char mid, CourseBag theBag, String major, int credits) {
		super(fn, ln, mid);
		this.theBag = theBag;
		this.major = major;
		this.credits = credits;
	}

	public Student(String fn, String ln, CourseBag theBag, String major, int credits) {
		super(fn, ln);
		this.theBag = theBag;
		this.major = major;
		this.credits = credits;
	}

	public String createTranscript() {
		String dashLine = "\t-----------------------------------------------\n";
		String doc = "";
		doc += "\t\t  " + COLLEGE_NAME + "\n";
		doc += "\t\t\t  " + PHONE + "\n";
		doc += "\tName:\t" + getName() + "\n";
		doc += "\tID: \t" + getID() + "\n";
		doc += dashLine;
		doc += "\tCourses Completed:\n";
		Course[] arr = getTheBag().getArray();
		for (int i = 0; i < getTheBag().getCount(); i++) {
			if (arr[i].getLetterGrade() != null) {
				doc += "\t\t" + arr[i] + "\n";
			}
		}
		doc += dashLine;
		doc += "\tCourses in Progress:\n";
		for (int i = 0; i < getTheBag().getCount(); i++) {
			if (arr[i].getLetterGrade() == null) {
				doc += "\t" + arr[i] + "\n";
			}
		}
		doc += dashLine;
		return doc;
	}
	
	public void displayTranscriptOnScreen() {
		System.out.println(createTranscript());
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
		return "\n[" + super.toString() + ", theBag=" + theBag + ", major=" + major + ", Credits=" + credits + "]";
	}

}
