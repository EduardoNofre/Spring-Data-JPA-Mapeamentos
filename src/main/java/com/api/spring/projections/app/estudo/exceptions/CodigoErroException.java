package com.api.spring.projections.app.estudo.exceptions;

import com.api.spring.projections.app.estudo.enums.protocoloInternalErrorCodesEnum;

public abstract class CodigoErroException extends Exception {

	private static final long serialVersionUID = 1L;

	protected protocoloInternalErrorCodesEnum errorcode;

	protected CodigoErroException(protocoloInternalErrorCodesEnum errorcode) {
		super(errorcode.getMessage());
		this.errorcode = errorcode;
	}

	protected CodigoErroException(protocoloInternalErrorCodesEnum errorcode, Object... args) {
		super(String.format(errorcode.getMessage(), args));
		this.errorcode = errorcode;
	}

	public protocoloInternalErrorCodesEnum getErrorcode() {
		return errorcode;
	}
}
