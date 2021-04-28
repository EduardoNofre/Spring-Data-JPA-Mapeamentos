package com.api.spring.projections.app.estudo.handle;

import static com.api.spring.projections.app.estudo.enums.protocoloInternalErrorCodesEnum.E404000;

import com.api.spring.projections.app.estudo.exceptions.GenericException;

public class FuncionarioNaoEncontradoExceptions extends GenericException {

	private static final long serialVersionUID = 1L;

	public FuncionarioNaoEncontradoExceptions() {
		super(E404000);
	}

	public FuncionarioNaoEncontradoExceptions(String msg) {
		super(E404000, msg);
	}

	public FuncionarioNaoEncontradoExceptions(String msg, Integer id) {
		super(E404000, msg, id);
	}

}
