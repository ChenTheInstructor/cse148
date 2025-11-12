package p1_basic_handling;

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		try {
			ThrowExceptionClass.validateAge(17);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
	}

}
