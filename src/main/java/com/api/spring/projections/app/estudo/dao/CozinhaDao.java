package com.api.spring.projections.app.estudo.dao;

import java.util.List;

import com.api.spring.projections.app.estudo.entity.CozinhaEntity;

public interface CozinhaDao {

	List<CozinhaEntity> buscaTodos();
	CozinhaEntity inserir(CozinhaEntity cozinhaEntity);
}
