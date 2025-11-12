package p2_functions_interface_api;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<String> isLongWord = (str) -> str.length() >= 5;
		System.out.println(isLongWord.test("Hello and goodbye"));
	}

}
