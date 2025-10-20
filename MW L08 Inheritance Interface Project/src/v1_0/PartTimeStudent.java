package v1_0;

public class PartTimeStudent extends Student {
	private static final double RATE_PER_CREDIT = 350;
//	private int credits;
	
	
	public PartTimeStudent(Name name, String major, int credits, CourseBag theBag) {
		super(name, major, credits, theBag);
	}

	public PartTimeStudent(String fn, String ln, char mid, String major, int credits, CourseBag theBag) {
		super(fn,ln, mid, major, credits, theBag);
	}

	public PartTimeStudent(String fn, String ln, String major, int credits, CourseBag theBag) {
		super(fn,ln, major, credits, theBag);
	}
	
	@Override
	public double tuition() {
		return getCredits() * RATE_PER_CREDIT;
	}

}
