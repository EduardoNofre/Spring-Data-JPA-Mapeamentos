package com.api.spring.projections.app.estudo.dao;

import java.util.List;

import com.api.spring.projections.app.estudo.entity.TarefaEntity;

public interface TarefaDao {

	List<TarefaEntity> buscaTodos();
	TarefaEntity inserir(TarefaEntity tarefaEntity);
}
