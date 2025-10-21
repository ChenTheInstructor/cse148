package v1_0;

public class PartTimeStudent extends Student {

	public PartTimeStudent(Name name, CourseBag theBag, String major, int credits) {
		super(name, theBag, major, credits);
	}

	public PartTimeStudent(String fn, String ln, char mid, CourseBag theBag, String major, int credits) {
		super(new Name(fn, ln, mid), theBag, major, credits);
	}

	public PartTimeStudent(String fn, String ln, CourseBag theBag, String major, int credits) {
		super(new Name(fn, ln), theBag, major, credits);
	}

	@Override
	public double tuition() {
		return getCredits() * RATE_PER_CREDIT;

	}

	public double getRATE_PER_CREDIT() {
		return RATE_PER_CREDIT;
	}

}
