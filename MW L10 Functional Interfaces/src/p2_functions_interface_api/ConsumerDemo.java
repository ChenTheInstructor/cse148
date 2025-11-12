package p2_functions_interface_api;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Integer> display = (n) -> System.out.println(n % 2 == 0);
		display.accept(100);
	}

}
