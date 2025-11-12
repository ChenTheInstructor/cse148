package p2_functions_interface_api;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		BinaryOperator<String> myBinary = (str1, str2) -> str1 +" " + str2;
		System.out.println(myBinary.apply("Steve", "Urkle"));
	}

}
