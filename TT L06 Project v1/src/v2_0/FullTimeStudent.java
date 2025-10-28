package v2_0;

public class FullTimeStudent extends Student {

	public FullTimeStudent(Name name, CourseBag theBag, String major, int credits) {
		super(name, theBag, major, credits);
	}

	public FullTimeStudent(String fn, String ln, char mid, CourseBag theBag, String major, int credits) {
		super(new Name(fn, ln, mid), theBag, major, credits);
	}

	public FullTimeStudent(String fn, String ln, CourseBag theBag, String major, int credits) {
		super(new Name(fn, ln), theBag, major, credits);
	}

	public double getFLAT_RATE() {
		return FLAT_RATE;
	}

	public double getRATE_PER_CREDIT_SURCHARGE() {
		return RATE_PER_CREDIT;
	}

	@Override
	public double tuition() {
		if (getCredits() <= 18) {
			return FLAT_RATE;
		} else {
			return FLAT_RATE + (getCredits() - 18) * RATE_PER_CREDIT;
		}
	}

	@Override
	public String toString() {
		return "\nFullTimeStudent [" + super.toString() + "]";
	}

}
