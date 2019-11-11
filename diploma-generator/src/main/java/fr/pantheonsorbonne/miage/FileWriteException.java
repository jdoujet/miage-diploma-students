package fr.pantheonsorbonne.miage;

public class FileWriteException extends RuntimeException {

	public FileWriteException() {

	}

	public FileWriteException(String message) {
		super(message);

	}

	public FileWriteException(Throwable cause) {
		super(cause);
	}

	public FileWriteException(String message, Throwable cause) {
		super(message, cause);

	}

	public FileWriteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}