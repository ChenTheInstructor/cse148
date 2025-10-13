package p1;

interface Calculator {
	
	int FEE_PER_PERSON = 50;
	
	double calculateTuition();
	double calculateGPA();
	double calculateTechnologyFees();
	
	default double getFee() {
		return 100.00;
	}
	
	static double getBookFees() {
		return 100.00;
		
		
	}
}
