package p2_functions_interface_api;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// Function <T, R>
		Function<String, String> myFunction1 = (str) -> "hello " + str;
		
		Function<String, Integer> myFunction2 = (str) -> str.length();
		
		System.out.println(myFunction1.apply("John Doe"));
		System.out.println(myFunction2.apply("Adam"));
		
		
		
	}

}
