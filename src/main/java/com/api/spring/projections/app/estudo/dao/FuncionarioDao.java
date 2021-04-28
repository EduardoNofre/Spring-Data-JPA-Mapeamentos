package com.api.spring.projections.app.estudo.dao;

import java.util.List;
import java.util.Optional;

import com.api.spring.projections.app.estudo.entity.FuncionarioEntity;

public interface FuncionarioDao {

	List<FuncionarioEntity> buscaTodos();

	Optional<FuncionarioEntity> buscaId(Integer id);

	void remover(Integer id);

	FuncionarioEntity inserir(FuncionarioEntity funcionario);
	
	FuncionarioEntity atualizar(FuncionarioEntity funcionario);

	boolean existeFuncionario(Integer id);
}
