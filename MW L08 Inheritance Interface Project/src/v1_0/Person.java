package v1_0;

public abstract class Person implements ParkingFeePayable {
	private final int PARKING_RATE_PER_PERIOD = 2;
	private final String id;
	private Name name;
	private static int idCount = 1;
	
	public Person(Name name) {
		super();
		this.id = String.valueOf(idCount++);
		this.name = name;
	}

	public Person(String firstName, String lastName, char midInitial) {
		this.id = String.valueOf(idCount++);
		this.name = new Name(firstName, lastName, midInitial);
	}
	
	public Person(String firstName, String lastName) {
		this.id = String.valueOf(idCount++);
		this.name = new Name(firstName, lastName);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public static int getIdCount() {
		return idCount;
	}

	public static void setIdCount(int idCount) {
		Person.idCount = idCount;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ID=" + id + ", name=" + name;
	}
	
	@Override
	public double parkingFee(int minutesParked) {
		if(minutesParked <= 0) {
			return 0;
		} else {
			double periods= (double)minutesParked / 30;
			double parkingFee = (int)(Math.ceil(periods) * PARKING_RATE_PER_PERIOD);
			if(parkingFee > 12) {
				parkingFee = 12;
			}
			return parkingFee;
		}
	}
}
