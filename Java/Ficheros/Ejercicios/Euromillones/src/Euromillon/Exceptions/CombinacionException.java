package Euromillon.Exceptions;;

public class CombinacionException extends RuntimeException {
	public CombinacionException() {
	}

	public CombinacionException(String message) {
		super(message);
	}

	public CombinacionException(Throwable cause) {
		super(cause);
	}

	public CombinacionException(String message, Throwable cause) {
		super(message, cause);
	}

	public CombinacionException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}