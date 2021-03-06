package com.api.spring.projections.app.estudo.exceptions;

import com.api.spring.projections.app.estudo.enums.protocoloInternalErrorCodesEnum;

public abstract class GenericException extends CodigoErroException {

	private static final long serialVersionUID = 1L;

	protected GenericException(protocoloInternalErrorCodesEnum errorcode) {
		super(errorcode);
	}

	protected GenericException(protocoloInternalErrorCodesEnum errorcode, Object... args) {
		super(errorcode, args);
	}
}
