package p2_functions_interface_api;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Integer> mySupplier = () -> (int)(Math.random() * 100);
		Supplier<Integer> mySupplier2 = SupplierDemo::intSupplier;
		System.out.println(mySupplier.get());
		System.out.println(mySupplier2.get());
		System.out.println(mySupplier2.get());
	}

	public static int intSupplier() {
		return (int) (Math.random() * 200);
	}
}
