package operatingSystem;

public class OSException extends RuntimeException {
	public OSException() {
		super();

	}

	public OSException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public OSException(String message, Throwable cause) {
		super(message, cause);

	}

	public OSException(String message) {
		super(message);

	}

	public OSException(Throwable cause) {
		super(cause);

	}

}
