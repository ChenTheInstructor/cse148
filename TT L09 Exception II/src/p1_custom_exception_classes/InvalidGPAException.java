package p1_custom_exception_classes;

public class InvalidGPAException extends Exception {
	public InvalidGPAException() {
		super();
	}

	public InvalidGPAException(String msg) {
		super(msg);
	}
}
