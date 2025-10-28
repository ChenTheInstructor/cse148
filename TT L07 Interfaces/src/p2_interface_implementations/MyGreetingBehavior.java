package p2_interface_implementations;

public class MyGreetingBehavior implements GreetingBehavior {

	@Override
	public void greet(String name) {
		System.out.println("Hey, " + name);
	}

}
