package com.api.spring.projections.app.estudo.dao;

import java.util.List;

import com.api.spring.projections.app.estudo.entity.RestauranteEntity;

public interface RestauranteDao {

	List<RestauranteEntity> buscaTodos();
	RestauranteEntity inserir(RestauranteEntity restauranteEntity);
}
