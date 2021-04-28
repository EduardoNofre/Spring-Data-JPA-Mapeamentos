package com.api.spring.projections.app.estudo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.spring.projections.app.estudo.dao.EmpresaDao;
import com.api.spring.projections.app.estudo.entity.EmpresaEntity;
import com.api.spring.projections.app.estudo.handle.EmpresaNaoEncontradoAtualizarExceptions;
import com.api.spring.projections.app.estudo.handle.EmpresaNaoEncontradoDeleteExceptions;
import com.api.spring.projections.app.estudo.handle.EmpresaNaoEncontradoExceptions;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaDao funcionarioDao;

	public List<EmpresaEntity> buscaTodosEmpresa() {

		return funcionarioDao.buscaTodos();

	}

	public EmpresaEntity buscaIdEmpresa(Integer id) throws Exception {

		Optional<EmpresaEntity> funcionario = funcionarioDao.buscaId(id);

		if (funcionario.isPresent()) {

			return funcionario.get();

		} else {

			throw new EmpresaNaoEncontradoExceptions();

		}
	}

	public Boolean removerEmpresa(Integer id) throws Exception{

		if (funcionarioDao.existeEmpresa(id)) {

			funcionarioDao.remover(id);

			return true;
		}

		throw new EmpresaNaoEncontradoDeleteExceptions();
	}

	public EmpresaEntity inserirEmpresa(String nome, String nomeFantasia, String cnpj) {

		EmpresaEntity funcionario = new EmpresaEntity();
		funcionario.setNome(nome);
		funcionario.setNomeFantasia(nomeFantasia);
		funcionario.setCnpj(cnpj);
//		for (EmpresaEntity funcionarios : funcionario.getFuncionarioEntityList()) {
//			
//			
//			funcionario.setFuncionarioEntityList(funcionarios);
//		}

		return funcionarioDao.inserir(funcionario);
	}

	public EmpresaEntity atualizarEmpresa(EmpresaEntity empresa) throws Exception {

		if (funcionarioDao.existeEmpresa(empresa.getIdEmpresa())) {

			return funcionarioDao.inserir(empresa);

		} else {

			throw new EmpresaNaoEncontradoAtualizarExceptions();
		}
	}
}
