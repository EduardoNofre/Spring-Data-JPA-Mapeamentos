package com.api.spring.projections.app.estudo.handle;

import static com.api.spring.projections.app.estudo.enums.protocoloInternalErrorCodesEnum.E404002;

import com.api.spring.projections.app.estudo.exceptions.GenericException;

public class FuncionarioNaoEncontradoAtualizarExceptions extends GenericException {

	private static final long serialVersionUID = 1L;

	public FuncionarioNaoEncontradoAtualizarExceptions() {
		super(E404002);
	}

	public FuncionarioNaoEncontradoAtualizarExceptions(String msg) {
		super(E404002, msg);
	}

	public FuncionarioNaoEncontradoAtualizarExceptions(String msg, Integer id) {
		super(E404002, msg, id);
	}

}
