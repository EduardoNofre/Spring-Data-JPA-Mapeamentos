package com.api.spring.projections.app.estudo.handle;

import static com.api.spring.projections.app.estudo.enums.protocoloInternalErrorCodesEnum.E404003;

import com.api.spring.projections.app.estudo.exceptions.GenericException;

public class EmpresaNaoEncontradoAtualizarExceptions  extends GenericException{

	private static final long serialVersionUID = 1L;

	public EmpresaNaoEncontradoAtualizarExceptions() {
		super(E404003);
	}

	public EmpresaNaoEncontradoAtualizarExceptions(String msg) {
		super(E404003, msg);
	}

	public EmpresaNaoEncontradoAtualizarExceptions(String msg, Integer id) {
		super(E404003, msg, id);
	}
}
