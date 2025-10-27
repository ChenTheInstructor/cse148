package v1_0;

public interface TuitionPayable {
	double FLAT_RATE = 4500;
	double RATE_PER_CREDIT = 350;
	int SURCHARGE_THRESHOLD = 18;
	
	double tuition();

//	static double getFlatTuition() {
//		return 4500.00;
//	}
}
