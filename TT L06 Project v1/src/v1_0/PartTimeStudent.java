package v1_0;

public class PartTimeStudent extends Student {
	private final double RATE_PER_CREDIT = 350;
	private int credits;

	public PartTimeStudent(Name name, CourseBag theBag, String major, int credits) {
		super(name, theBag, major);
		this.credits = credits;
	}

	public PartTimeStudent(String fn, String ln, char mid, CourseBag theBag, String major, int credits) {
		super(new Name(fn, ln, mid), theBag, major);
		this.credits = credits;
	}

	public PartTimeStudent(String fn, String ln, CourseBag theBag, String major, int credits) {
		super(new Name(fn, ln), theBag, major);
		this.credits = credits;
	}

	@Override
	public double tuition() {
		return credits * RATE_PER_CREDIT;

	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public double getRATE_PER_CREDIT() {
		return RATE_PER_CREDIT;
	}

}
