package p6_java_functional_interfaces;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<LocalDate> todaySupplier = () -> LocalDate.now();
		System.out.println("Today is: " + todaySupplier.get());
	}

}
