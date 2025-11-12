package p6_java_functional_interfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		BinaryOperator<Integer> sum = (a, b) -> a + b;
		System.out.println(sum.apply(10, 20));
	}

}
