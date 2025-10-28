package p4_calculator;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator add = (a, b) -> a + b;
		Calculator subtract = (a, b) -> a - b;
		Calculator multiply = (a, b) -> a * b;
		Calculator divide = (a, b) -> a / b;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		System.out.println("Sum: " + add.compute(a, b));
		System.out.println("Differece: " + subtract.compute(a, b));
		System.out.println("Product: " + multiply.compute(a, b));
		System.out.println("Quotient: " + divide.compute(a, b));
	}

}
