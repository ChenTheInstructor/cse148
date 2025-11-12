package p2_functions_interface_api;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		UnaryOperator<String> myUnary = (n) -> "nicer " + n;
		
		System.out.println(myUnary.apply("Steve"));
	}

}
