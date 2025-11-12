package p6_java_functional_interfaces;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String, Integer> lengthMapper = (s) -> s.length();
		
		Function<String, String> lowerCase = (s) -> s.toLowerCase();
		System.out.println(lengthMapper.apply("HelloBye"));
		System.out.println(lowerCase.apply("HelloBye"));
	}

}
