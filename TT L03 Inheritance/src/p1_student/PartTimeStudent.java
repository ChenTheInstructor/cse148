package p1_student;

public class PartTimeStudent extends Student {
	private int credits;
	private static final double PRICE_PER_CREDIT = 1100.99;
	
	public PartTimeStudent(String name, int id, int credits) {
		super(name, id);
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

	public void showInfo() {
		System.out.println(super.toString());
		System.out.println("Credits: " + credits);
		System.out.println("Tuition: " + (credits * PRICE_PER_CREDIT));
	}
	
	@Override
	public double calculateTuition() {
		return credits * PRICE_PER_CREDIT;
	}

	@Override
	public String toString() {
		return "PartTimeStudent [" + super.toString() + ", credits=" + credits + "]";
	}
	
	
//	public static void setPRICE_PER_CREDIT(double price) {
//		PartTimeStudent.PRICE_PER_CREDIT = price;
//	}
}
