package com.api.spring.projections.app.estudo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.spring.projections.app.estudo.dao.FuncionarioDao;
import com.api.spring.projections.app.estudo.entity.FuncionarioEntity;
import com.api.spring.projections.app.estudo.repository.FuncionarioRepository;

@Component
public class FuncionarioDaoDaoImpl implements FuncionarioDao {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	public List<FuncionarioEntity> buscaTodos() {

		List<FuncionarioEntity> funcionarioEntity = funcionarioRepository.findAll();

		return funcionarioEntity;
	}

	public Optional<FuncionarioEntity> buscaId(Integer id) {

		Optional<FuncionarioEntity> funcionarioEntity = funcionarioRepository.findById(id);

		return funcionarioEntity;
	}

	public void remover(Integer id) {

		funcionarioRepository.deleteById(id);

	}

	public FuncionarioEntity inserir(FuncionarioEntity funcionario) {

		FuncionarioEntity funcionarioEntity = funcionarioRepository.save(funcionario);

		return funcionarioEntity;
	}

	public FuncionarioEntity atualizar(FuncionarioEntity funcionario) {

		FuncionarioEntity funcionarioEntity = funcionarioRepository.save(funcionario);

		return funcionarioEntity;
	}
	
	public boolean existeFuncionario(Integer id) {

		return funcionarioRepository.findById(id).isPresent();

	}
}
