package p2_interface_implementations;

public class LambdaDemo {

	public static void main(String[] args) {
		GreetingBehavior gb = (name) -> {
			System.out.println("Howdy, " + name);
			System.out.println("Howdy again, " + name);
			System.out.println("again and again!");
		};
	
		gb.greet("Suzie");
		gb = (n) -> System.out.println("Bye " + n);
		gb.greet("Bill");
	}

}
