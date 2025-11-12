package p6_java_functional_interfaces;

import java.util.Arrays;

public class StreamDemo {

	public static void main(String[] args) {
		Integer[] arr = { 3, 7, 9, 2, 8, 1, 3, 7, 13 };
		Arrays.stream(arr).filter((n) -> n % 2 == 1).forEach((n) -> System.out.println(n));
		Arrays.stream(arr).filter((n) -> n % 2 == 1).forEach(StreamDemo::doublePrint); // method reference
		
	}
	
	public static void doublePrint(int n) {
		System.out.print(n*2 + " ");
	}

}
