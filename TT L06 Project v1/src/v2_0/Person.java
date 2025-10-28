package v2_0;

public abstract class Person implements ParkingFeePayable {
//	private final static double RATE_PER_PERIOD = 2.0;
	private final String ID;
	private Name name;
	
	private static int idCount = 1;
	
	// overloaded constructors
	public Person(Name name) {
		this.name = name;
		ID = String.valueOf(idCount++);
	}
	
	public Person(String fn, String ln, char mid) {
		name = new Name(fn, ln, mid);
		ID = String.valueOf(idCount++);
	}
	
	public Person(String fn, String ln) {
		name = new Name(fn, ln);
		ID = String.valueOf(idCount++);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	@Override
	public String toString() {
		return "\n[ID=" + ID + ", name=" + name + "]";
	}
	
	@Override
	public double parkingFee(int minutesParked) {
		if(minutesParked <= 0) {
			return 0;
		} 
		
		double periods = (double)minutesParked / 30;
		double parkingFee = (int)(Math.ceil(periods) * RATE_PER_PERIOD);
		if(parkingFee > 12) {
			parkingFee = 12;
		}
		return parkingFee;
	}
}
