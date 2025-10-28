package p3_lambda;

import java.util.Random;

public class RandomNumberDemo {

	public static void main(String[] args) {
		RandomNumberGenerator rng = () ->  Math.random() * 100;
		
		
		
		System.out.println(rng.getRandomNumber());
		System.out.println(rng.getRandomNumber());
		System.out.println(rng.getRandomNumber());
		
		rng = () -> { 
			Random rand = new Random();
			return rand.nextDouble();
		};
	}

}
