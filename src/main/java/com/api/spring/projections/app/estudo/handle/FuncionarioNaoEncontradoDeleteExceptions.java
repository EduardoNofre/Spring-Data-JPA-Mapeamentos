package com.api.spring.projections.app.estudo.handle;

import static com.api.spring.projections.app.estudo.enums.protocoloInternalErrorCodesEnum.E404001;

import com.api.spring.projections.app.estudo.exceptions.GenericException;

public class FuncionarioNaoEncontradoDeleteExceptions extends GenericException{

	private static final long serialVersionUID = 1L;

	public FuncionarioNaoEncontradoDeleteExceptions() {
		super(E404001);
	}

	public FuncionarioNaoEncontradoDeleteExceptions(String msg) {
		super(E404001, msg);
	}

	public FuncionarioNaoEncontradoDeleteExceptions(String msg, Integer id) {
		super(E404001, msg, id);
	}

}
