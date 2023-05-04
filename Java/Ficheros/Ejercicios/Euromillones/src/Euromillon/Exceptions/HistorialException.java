package Euromillon.Exceptions;;

public class HistorialException extends RuntimeException {
	public HistorialException() {
	}

	public HistorialException(String message) {
		super(message);
	}

	public HistorialException(Throwable cause) {
		super(cause);
	}

	public HistorialException(String message, Throwable cause) {
		super(message, cause);
	}

	public HistorialException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}