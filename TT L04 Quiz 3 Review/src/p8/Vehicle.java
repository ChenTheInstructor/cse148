package p8;

public class Vehicle {
	private int maxSpeed;
	
//	public Vehicle() {
//		
//	}
	
	public Vehicle(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	@Override
	public String toString() {
		return "Max Speed: " + maxSpeed;
	}
}
