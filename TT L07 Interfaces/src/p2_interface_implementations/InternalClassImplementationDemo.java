package p2_interface_implementations;

public class InternalClassImplementationDemo {

	public static void main(String[] args) {
		MyGreetingBehavior mgb = (new InternalClassImplementationDemo()).new MyGreetingBehavior();
		mgb.greet("Adam");
	}

	// Inner class
	private class MyGreetingBehavior implements GreetingBehavior {

		@Override
		public void greet(String name) {
			System.out.println("Hi " + name);
		}
		
	}
	
}
