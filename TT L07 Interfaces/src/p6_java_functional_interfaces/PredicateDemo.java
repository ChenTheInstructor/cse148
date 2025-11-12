package p6_java_functional_interfaces;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<String> isLongWord = (s) -> s.length() > 5;
		Predicate<String> startsWithA = (s) -> s.toUpperCase().startsWith("A");
		
		System.out.println(isLongWord.test("Hello"));
		System.out.println(isLongWord.test("HelloWorld!"));
		
		System.out.println(startsWithA.test("apple"));
		System.out.println(startsWithA.test("Pear"));
	}

}
