package com.api.spring.projections.app.estudo.dao;

import java.util.List;

import com.api.spring.projections.app.estudo.entity.AulaEntity;

public interface AulaDao {

	List<AulaEntity> buscaTodos();
	AulaEntity inserir(AulaEntity aulaEntity);
}
