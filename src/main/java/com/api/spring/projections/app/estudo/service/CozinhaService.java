package com.api.spring.projections.app.estudo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.spring.projections.app.estudo.dao.CozinhaDao;
import com.api.spring.projections.app.estudo.entity.CozinhaEntity;

@Service
public class CozinhaService {

	@Autowired
	private CozinhaDao cozinhaDao;

	public CozinhaEntity cadastroCozinha(CozinhaEntity cozinhaEntity) {
		return cozinhaDao.inserir(cozinhaEntity);
	}

	public List<CozinhaEntity> buscaTodasCozinha() {
		return cozinhaDao.buscaTodos();
	}

}
