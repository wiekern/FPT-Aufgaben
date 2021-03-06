package fpt.shop;

public class IDGenerator {
	private static long idCounter = 0;
	
	public static void resetIDCounter() {
		idCounter = 0;
	}
	
	// id range: [1,999998]
	public static long generateId() throws IDOverflowException {
		if (idCounter == 999999) {
			throw new IDOverflowException("ID Overflow.");
		}
		return ++idCounter;
	}
}

class IDOverflowException extends Exception {
	private static final long serialVersionUID = 8783326485907865572L;

	public IDOverflowException() {
		super();
	}
	
	public IDOverflowException(String message) {
		super(message);
	}
}
