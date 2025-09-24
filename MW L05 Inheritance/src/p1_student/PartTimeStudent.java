package p1_student;

public class PartTimeStudent extends Student {
	private int credits;
	private static final double PRICE_PER_CREDIT = 1100.99;
	
	public PartTimeStudent(String name, int id, int credits) {
		super(name, id);
		this.credits = credits;
	}
	
	public void showInfo() {
		System.out.println(super.toString());
		System.out.println("Credits: " + credits);
		System.out.println("Tuition: " + (credits * PRICE_PER_CREDIT));
	}

	@Override
	public String toString() {
		return "PartTimeStudent [" + super.toString() + ", credits=" + credits + "]";
	}
	
	
}
