package v1_0;

public class DummyClass implements ParkingFeePayable, TuitionPayable {

	@Override
	public double tuition() {
		return 10000;
	}

	@Override
	public double parkingFee(int minutesParked) {
		return 12;
	}

}
