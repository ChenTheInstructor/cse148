package p1_basic_handling;

public class DataTypeDemo {

	public static void main(String[] args) {
		// nested try-catch blocks
		try {

			int c = 0;
			try {
				int a = 20;
				int b = 0;
				c = a / b;
			} catch (ArithmeticException e) {
				System.out.println("Divide by zero!");
//				e.printStackTrace();
			}
			int[] arr = new int[3];
			arr[3] = c;
			return;
		} catch (RuntimeException e) {
			System.out.println("Array index out of bounds.");
//			e.printStackTrace();
		} finally { // always executed.
			System.out.println("In the finally block!");
		}

		System.out.println("The end!");
	}

}
