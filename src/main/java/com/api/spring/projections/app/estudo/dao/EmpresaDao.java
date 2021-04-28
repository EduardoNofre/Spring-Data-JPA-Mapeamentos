package com.api.spring.projections.app.estudo.dao;

import java.util.List;
import java.util.Optional;

import com.api.spring.projections.app.estudo.entity.EmpresaEntity;

public interface EmpresaDao {

	List<EmpresaEntity> buscaTodos();

	Optional<EmpresaEntity> buscaId(Integer id);

	void remover(Integer id);

	EmpresaEntity inserir(EmpresaEntity funcionario);
	
	EmpresaEntity atualizar(EmpresaEntity funcionario);

	boolean existeEmpresa(Integer id);
}
