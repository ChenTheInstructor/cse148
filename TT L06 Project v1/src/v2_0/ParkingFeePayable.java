package v2_0;

public interface ParkingFeePayable {
	double RATE_PER_PERIOD = 2.0;
	double parkingFee(int minutesParked);
}
