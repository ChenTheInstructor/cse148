package p2_interface_implementations;

public class LambdaDemo {

	public static void main(String[] args) {
		GreetingBehavior gb1 = (name) -> {
			System.out.println("Howdy, " + name);
			System.out.println("Howdy again, " + name);
			System.out.println("again and again!");
		};
	
		gb1.greet("Suzie");
		GreetingBehavior gb2 = (n) -> System.out.println("Bye " + n);
		
		GreetingBehavior gb3 = (n) -> System.out.println("Goodbye " + n);
		gb3.greet("Bill");
	}

}
