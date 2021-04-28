package com.api.spring.projections.app.estudo.handle;

import static com.api.spring.projections.app.estudo.enums.protocoloInternalErrorCodesEnum.E404005;

import com.api.spring.projections.app.estudo.exceptions.GenericException;

public class EmpresaNaoEncontradoDeleteExceptions extends GenericException {

	private static final long serialVersionUID = 1L;

	public EmpresaNaoEncontradoDeleteExceptions() {
		super(E404005);
	}

	public EmpresaNaoEncontradoDeleteExceptions(String msg) {
		super(E404005, msg);
	}

	public EmpresaNaoEncontradoDeleteExceptions(String msg, Integer id) {
		super(E404005, msg, id);
	}
}