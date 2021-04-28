package com.api.spring.projections.app.estudo.exceptions;

public class ApiException extends Exception{

	private static final long serialVersionUID = 1L;

	public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }
}
