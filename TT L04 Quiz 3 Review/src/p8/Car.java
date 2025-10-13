package p8;

public class Car extends Vehicle {
	private int seats;
	
	public Car(int maxSpeed, int seats) {
		super(maxSpeed);
		this.seats = seats;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Seats: " + seats;
	}
}
