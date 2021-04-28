package com.api.spring.projections.app.estudo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.spring.projections.app.estudo.dao.FuncionarioDao;
import com.api.spring.projections.app.estudo.entity.FuncionarioEntity;
import com.api.spring.projections.app.estudo.repository.ProjectionRepository;

@Component
public class FuncionarioDaoDaoImpl implements FuncionarioDao {

	@Autowired
	private ProjectionRepository projectionRepository;

	public List<FuncionarioEntity> buscaTodos() {

		List<FuncionarioEntity> funcionarioEntity = projectionRepository.findAll();

		return funcionarioEntity;
	}

	public Optional<FuncionarioEntity> buscaId(Integer id) {

		Optional<FuncionarioEntity> funcionarioEntity = projectionRepository.findById(id);

		return funcionarioEntity;
	}

	public void remover(Integer id) {

		projectionRepository.deleteById(id);

	}

	public FuncionarioEntity inserir(FuncionarioEntity funcionario) {

		FuncionarioEntity funcionarioEntity = projectionRepository.save(funcionario);

		return funcionarioEntity;
	}

	public FuncionarioEntity atualizar(FuncionarioEntity funcionario) {

		FuncionarioEntity funcionarioEntity = projectionRepository.save(funcionario);

		return funcionarioEntity;
	}
	
	public boolean existeFuncionario(Integer id) {

		return projectionRepository.findById(id).isPresent();

	}
}
