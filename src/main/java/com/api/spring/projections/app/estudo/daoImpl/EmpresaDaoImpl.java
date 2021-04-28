package com.api.spring.projections.app.estudo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.spring.projections.app.estudo.dao.EmpresaDao;
import com.api.spring.projections.app.estudo.entity.EmpresaEntity;
import com.api.spring.projections.app.estudo.repository.EmpresaRepository;

@Component
public class EmpresaDaoImpl implements EmpresaDao{

	@Autowired
	private EmpresaRepository empresaRepository;

	public List<EmpresaEntity> buscaTodos() {

		List<EmpresaEntity> funcionarioEntity = empresaRepository.findAll();

		return funcionarioEntity;
	}

	public Optional<EmpresaEntity> buscaId(Integer id) {

		Optional<EmpresaEntity> funcionarioEntity = empresaRepository.findById(id);

		return funcionarioEntity;
	}

	public void remover(Integer id) {

		empresaRepository.deleteById(id);

	}

	public EmpresaEntity inserir(EmpresaEntity funcionario) {

		EmpresaEntity funcionarioEntity = empresaRepository.save(funcionario);

		return funcionarioEntity;
	}

	public EmpresaEntity atualizar(EmpresaEntity funcionario) {

		EmpresaEntity funcionarioEntity = empresaRepository.save(funcionario);

		return funcionarioEntity;
	}
	
	public boolean existeEmpresa(Integer id) {

		return empresaRepository.findById(id).isPresent();

	}
}
