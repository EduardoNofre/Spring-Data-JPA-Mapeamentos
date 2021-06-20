package com.api.spring.projections.app.estudo.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.spring.projections.app.estudo.dao.AulaDao;
import com.api.spring.projections.app.estudo.entity.AulaEntity;
import com.api.spring.projections.app.estudo.repository.AulaRepository;

@Component
public class AulaDaoImpl implements AulaDao {

	@Autowired
	private AulaRepository aulaRepository;

	@Override
	public List<AulaEntity> buscaTodos() {
		return aulaRepository.findAll();
	}

	@Override
	public AulaEntity inserir(AulaEntity aulaEntity) {
		return aulaRepository.save(aulaEntity);
	}

}
