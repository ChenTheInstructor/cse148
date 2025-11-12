package p1_basic_handling;

public class ThrowExceptionClass {
	public static void validateAge(int age) {
		if(age < 18) {
			throw new IllegalArgumentException("Must be 18 or older to vote!");
		} else {
			System.out.println("Eligible to vote!");
		}
	}
}
