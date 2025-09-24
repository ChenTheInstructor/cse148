package p1;

public class Demo {

	public static void main(String[] args) {
		Pet c1 = new Cat("C1", 10.5);
		System.out.println(c1);
		((Cat)c1).meow();
		c1.move();
		
		Pet d1 = new Dog("D1","Golden");
		System.out.println(d1);
		((Dog)d1).bark();
		d1.move();
	}

}
