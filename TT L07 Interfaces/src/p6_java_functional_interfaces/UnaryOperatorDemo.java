package p6_java_functional_interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		UnaryOperator<String> toUpperCase = (s) -> s.toUpperCase() + " Joe!";
		System.out.println(toUpperCase.apply("Hello"));
	}

}
