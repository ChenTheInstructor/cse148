package p1;

public class Demo {

	public static void main(String[] args) {
//		Computable add = new Computable() { // anonymous class implementation 
//
//			@Override
//			public double calculate(double x, double y) {
//				return x + y;
//			}
//			
//		};
//		
//		System.out.println(add.calculate(10.5, 21.6));
		
		Computable sum = (m1, m2) -> m1 + m2;
		Computable subtract = (n1, n2) -> n1 - n2; // lambda expression used to implement functional interface
		Computable multiply = (x, y) -> x * y;
		Computable divide = (i, j) -> {
			i  = 1 * 100; 
			return i / j;
		};
		
		System.out.println(sum.calculate(10.5, 21.6));
		System.out.println(subtract.calculate(10.5, 21.6));
		System.out.println(multiply.calculate(10.5, 21.6));
		System.out.println(divide.calculate(10.5, 21.6));
	}

}
