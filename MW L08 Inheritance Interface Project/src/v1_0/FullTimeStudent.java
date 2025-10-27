package v1_0;

public class FullTimeStudent extends Student {
	
//	private int credits;

	public FullTimeStudent(Name name, String major, int credits, CourseBag theBag) {
		super(name, major, credits, theBag);
	}

	public FullTimeStudent(String fn, String ln, char mid, int credits, String major, CourseBag theBag) {
		super(fn, ln, mid, major, credits, theBag);
	}

	public FullTimeStudent(String fn, String ln, String major, int credits, CourseBag theBag) {
		super(fn, ln, major, credits, theBag);
	}

	@Override
	public double tuition() {
		if (getCredits() <= SURCHARGE_THRESHOLD) {
			return FLAT_RATE;
		} else {
			return FLAT_RATE + (getCredits() - SURCHARGE_THRESHOLD) * RATE_PER_CREDIT;
		}
	}

	
}
