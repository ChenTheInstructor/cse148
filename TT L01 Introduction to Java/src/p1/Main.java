package p1;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.toString());
		Car c2 = new Car("Tesla", 50000.00);
		System.out.println(c2.toString());
		System.out.println(c1.equals(c1));
		System.out.println(c1 == c2);
	}

}
