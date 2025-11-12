package p6_java_functional_interfaces;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> printer = (s) -> System.out.println(s); 
		Consumer<Double> formatPrinter = (d) -> System.out.printf("%10.3f%n", d);
		
		printer.accept("Hello");
		formatPrinter.accept(2345.12345678);
	}

}
