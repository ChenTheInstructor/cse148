package p1_basic_handling;

public class DivideDemo {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 2;
			int c = a / b; // JVM creates an exception object; unchecked exception: unchecked by compiler
			System.out.println(c);
			System.out.println("Still in the try-block!");
		} catch (ArithmeticException e) { // the exception gets caught by catch and named as e
			System.out.println("Cannot be divided by zero!");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Another exception occurred");
		}

		System.out.println("The End");
	}

}
