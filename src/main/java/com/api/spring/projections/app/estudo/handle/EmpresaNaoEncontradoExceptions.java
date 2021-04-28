package com.api.spring.projections.app.estudo.handle;

import static com.api.spring.projections.app.estudo.enums.protocoloInternalErrorCodesEnum.E404004;

import com.api.spring.projections.app.estudo.exceptions.GenericException;

public class EmpresaNaoEncontradoExceptions extends GenericException {

	private static final long serialVersionUID = 1L;

	public EmpresaNaoEncontradoExceptions() {
		super(E404004);
	}

	public EmpresaNaoEncontradoExceptions(String msg) {
		super(E404004, msg);
	}

	public EmpresaNaoEncontradoExceptions(String msg, Integer id) {
		super(E404004, msg, id);
	}

}