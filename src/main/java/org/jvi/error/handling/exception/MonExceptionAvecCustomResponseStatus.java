package org.jvi.error.handling.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MonExceptionAvecCustomResponseStatus extends RuntimeException {

	private static final long serialVersionUID = 8473113173908939323L;

	public MonExceptionAvecCustomResponseStatus(final String message) {

		super(message);
	}

}
