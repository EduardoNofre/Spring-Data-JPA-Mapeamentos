package com.api.spring.projections.app.estudo.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.spring.projections.app.estudo.dao.RestauranteDao;
import com.api.spring.projections.app.estudo.entity.RestauranteEntity;
import com.api.spring.projections.app.estudo.repository.RestauranteRepository;


@Component
public class RestauranteDaoImpl implements RestauranteDao{

	
	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Override
	public List<RestauranteEntity> buscaTodos() {
		return restauranteRepository.findAll();
	}

	@Override
	public RestauranteEntity inserir(RestauranteEntity funcionario) {
		
		return restauranteRepository.save(funcionario);
	}

}
