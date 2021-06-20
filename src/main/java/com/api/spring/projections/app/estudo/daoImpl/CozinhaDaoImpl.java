package com.api.spring.projections.app.estudo.daoImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.spring.projections.app.estudo.dao.CozinhaDao;
import com.api.spring.projections.app.estudo.entity.CozinhaEntity;
import com.api.spring.projections.app.estudo.repository.CozinhaRepository;

@Component
public class CozinhaDaoImpl implements CozinhaDao {

	@Autowired
	private CozinhaRepository cozinhaRepository;

	@Override
	public List<CozinhaEntity> buscaTodos() {
		return cozinhaRepository.findAll();
	}

	@Override
	public CozinhaEntity inserir(CozinhaEntity funcionario) {
		return cozinhaRepository.save(funcionario);
	}
}
