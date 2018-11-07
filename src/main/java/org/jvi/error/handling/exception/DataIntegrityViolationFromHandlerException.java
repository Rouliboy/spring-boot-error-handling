package org.jvi.error.handling.exception;

public class DataIntegrityViolationFromHandlerException extends RuntimeException {

	private static final long serialVersionUID = 8473113173908939323L;

	public DataIntegrityViolationFromHandlerException(final String message) {

		super(message);
	}

}
