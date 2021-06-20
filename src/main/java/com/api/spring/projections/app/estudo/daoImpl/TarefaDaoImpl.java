package com.api.spring.projections.app.estudo.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.spring.projections.app.estudo.dao.TarefaDao;
import com.api.spring.projections.app.estudo.entity.TarefaEntity;
import com.api.spring.projections.app.estudo.repository.TarefaRepository;

@Component
public class TarefaDaoImpl implements  TarefaDao{

	@Autowired
	private TarefaRepository tarefaRepository;
	
	@Override
	public List<TarefaEntity> buscaTodos() {
		return tarefaRepository.findAll();
	}

	@Override
	public TarefaEntity inserir(TarefaEntity tarefaEntity) {
		return tarefaRepository.save(tarefaEntity);
	}

}
