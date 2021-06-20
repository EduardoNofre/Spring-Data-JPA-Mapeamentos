package com.api.spring.projections.app.estudo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.spring.projections.app.estudo.dao.RestauranteDao;
import com.api.spring.projections.app.estudo.entity.RestauranteEntity;

@Service
public class RestauranteService {
	
	@Autowired
	private RestauranteDao restauranteDao;

	public  List<RestauranteEntity> buscaTodosRestaurante() {
		// TODO Auto-generated method stub
		return restauranteDao.buscaTodos();
	}

	public  RestauranteEntity cadastroRestaurante(RestauranteEntity restauranteEntity) {
		// TODO Auto-generated method stub
		return restauranteDao.inserir(restauranteEntity);
	}
}
