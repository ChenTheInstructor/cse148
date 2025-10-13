package p8;

import java.util.Optional;

public class VehicleBag {
	private Vehicle[] arr;
	private int vehicleCount;
	
	public VehicleBag(int maxSize) {
		arr = new Vehicle[maxSize];
		vehicleCount = 0;
	}
	
	public Optional<Vehicle> searchByMaxSpeed(int maxSpeed) {
		for(int i  =0; i < vehicleCount; i++) {
			if(arr[i].getMaxSpeed() == maxSpeed) {
				return Optional.of(arr[i]);
			}
		}
		return Optional.ofNullable(null);
	}
	
	public void insert(Vehicle v) {
		arr[vehicleCount++] = v;
//		vehicleCount++;
	}
	
	public void display() {
		for(int i = 0; i < vehicleCount; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
}
