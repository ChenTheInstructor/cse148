package p1;

public class PartTimeStudent extends Student {
	private int credits;
	private static final double PRICE_PER_CREDIT = 999.99;
	private static final double PARKING_FEE_PER_CREDIT = 4.99;

	public PartTimeStudent(String name, double gpa, int credits) {
		super(name, gpa);
		this.credits = credits;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public static double getPricePerCredit() {
		return PRICE_PER_CREDIT;
	}

	public static double getParkingFeePerCredit() {
		return PARKING_FEE_PER_CREDIT;
	}

	@Override
	public double calculateParkingFees() {
		return credits * PARKING_FEE_PER_CREDIT;
	}

	@Override
//	public String toString() {
//		return "Name: " + getName() +", ID: " + getId() 
//			+ ", GPA:" + getGpa() +", Parking: $" + String.format("%5.2f", calculateParkingFees());
//	}
	public String toString() {
		return super.toString() + ", Parking: $" + String.format("%5.2f", calculateParkingFees());
	}

	@Override
	public double calculateTuition() {
		return credits * PRICE_PER_CREDIT;
	}

	@Override
	public double calculateGPA() {
		return 3.0;
	}

	@Override
	public double calculateTechnologyFees() {
		return 75.0;
	}
}
