package v1_0;

public interface ParkingFeePayable {
	double PARKING_RATE_PER_PERIOD = 2;
	double parkingFee(int minutesParked);
	
//	static double getFlatTuition() {
//		return 1000.0;
//	}
}
