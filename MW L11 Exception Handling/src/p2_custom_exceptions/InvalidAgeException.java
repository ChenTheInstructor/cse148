package p2_custom_exceptions;

public class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}
