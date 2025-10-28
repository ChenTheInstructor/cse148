package p2_interface_implementations;

public class AnonymousClassDemo {

	public static void main(String[] args) {
		GreetingBehavior gb = new GreetingBehavior() {

			@Override
			public void greet(String name) {
				System.out.println("Hello " + name);
			}
			
		};
		
		gb.greet("Alice");
	}

}
