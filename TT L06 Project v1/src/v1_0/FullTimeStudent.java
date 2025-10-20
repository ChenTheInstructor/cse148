package v1_0;

public class FullTimeStudent extends Student {
	private final double FLAT_RATE = 4500;
	private final double RATE_PER_CREDIT_SURCHARGE = 350;
	private int credits;

	public FullTimeStudent(Name name, CourseBag theBag, String major, int credits) {
		super(name, theBag, major);
		this.credits = credits;
	}

	public FullTimeStudent(String fn, String ln, char mid, CourseBag theBag, String major, int credits) {
		super(new Name(fn, ln, mid), theBag, major);
		this.credits = credits;
	}

	public FullTimeStudent(String fn, String ln, CourseBag theBag, String major, int credits) {
		super(new Name(fn, ln), theBag, major);
		this.credits = credits;
	}
	
	

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public double getFLAT_RATE() {
		return FLAT_RATE;
	}

	public double getRATE_PER_CREDIT_SURCHARGE() {
		return RATE_PER_CREDIT_SURCHARGE;
	}

	@Override
	public double tuition() {
		if (credits <= 18) {
			return FLAT_RATE;
		} else {
			return FLAT_RATE + (credits - 18) * RATE_PER_CREDIT_SURCHARGE;
		}
	}

	@Override
	public String toString() {
		return "\nFullTimeStudent [" + super.toString() + ", credits=" + credits + "]";
	}

	
}
