package com.api.spring.projections.app.estudo.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.spring.projections.app.estudo.dao.TarefaDao;
import com.api.spring.projections.app.estudo.entity.TarefaEntity;

@Service
public class TarefaService {

	@Autowired
	private TarefaDao tarefaDao;

	public List<TarefaEntity> buscaTodasTarefa() {
		return tarefaDao.buscaTodos();
	}

	public TarefaEntity cadastroTarefa(@Valid TarefaEntity tarefaEntity) {
		return tarefaDao.inserir(tarefaEntity);
	}

}
