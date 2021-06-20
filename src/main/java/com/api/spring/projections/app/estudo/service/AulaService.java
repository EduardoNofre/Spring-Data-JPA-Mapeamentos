package com.api.spring.projections.app.estudo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.spring.projections.app.estudo.dao.AulaDao;
import com.api.spring.projections.app.estudo.entity.AulaEntity;

@Service
public class AulaService {

	@Autowired
	private AulaDao aulaDao;

	public List<AulaEntity> buscaTodasAula() {
		return aulaDao.buscaTodos();
	}

	public AulaEntity cadastroAula(AulaEntity aulaEntity) {
		return aulaDao.inserir(aulaEntity);
	}

}
