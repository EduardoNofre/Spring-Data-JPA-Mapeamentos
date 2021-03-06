package com.api.spring.projections.app.estudo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.spring.projections.app.estudo.dao.FuncionarioDao;
import com.api.spring.projections.app.estudo.entity.EmpresaEntity;
import com.api.spring.projections.app.estudo.entity.FuncionarioEntity;
import com.api.spring.projections.app.estudo.entity.RefeicaoEntity;
import com.api.spring.projections.app.estudo.exceptions.CodigoErroException;
import com.api.spring.projections.app.estudo.handle.FuncionarioNaoEncontradoAtualizarExceptions;
import com.api.spring.projections.app.estudo.handle.FuncionarioNaoEncontradoDeleteExceptions;
import com.api.spring.projections.app.estudo.handle.FuncionarioNaoEncontradoExceptions;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioDao funcionarioDao;

	public List<FuncionarioEntity> buscaTodosFuncionario() {

		return funcionarioDao.buscaTodos();

	}

	public FuncionarioEntity buscaIdFuncionario(Integer id) throws Exception {

		Optional<FuncionarioEntity> funcionario = funcionarioDao.buscaId(id);

		if (funcionario.isPresent()) {

			return funcionario.get();

		} else {

			throw new FuncionarioNaoEncontradoExceptions();

		}
	}

	public Boolean removerFuncionario(Integer id) throws CodigoErroException {

		if (funcionarioDao.existeFuncionario(id)) {

			funcionarioDao.remover(id);

			return true;
		}

		System.out.println();

		throw new FuncionarioNaoEncontradoDeleteExceptions(String.valueOf(id));
	}

	public FuncionarioEntity inserirFuncionario(String nome, Integer idade, double valor, String email, String endereco,
			String cidade, String uf, String municipio) {

		FuncionarioEntity funcionario = new FuncionarioEntity();
		funcionario.setNome(nome);
		funcionario.setIdade(idade);
		funcionario.setValor(valor);
		funcionario.setEmail(email);
		funcionario.setEndereco(endereco);
		funcionario.setCidade(cidade);
		funcionario.setUf(uf);
		funcionario.setMunicipio(municipio);

		return funcionarioDao.inserir(funcionario);
	}

	public FuncionarioEntity inserirFuncionario(FuncionarioEntity funcionarios) {

		FuncionarioEntity funcionario = new FuncionarioEntity();
		EmpresaEntity empresaEntity = new EmpresaEntity();

		funcionario.setNome(funcionarios.getNome());
		funcionario.setIdade(funcionarios.getIdade());
		funcionario.setValor(funcionarios.getValor());
		funcionario.setEmail(funcionarios.getEmail());
		funcionario.setEndereco(funcionarios.getEndereco());
		funcionario.setCidade(funcionarios.getCidade());
		funcionario.setUf(funcionarios.getUf());
		funcionario.setMunicipio(funcionarios.getMunicipio());
		empresaEntity.setId_Empresa(funcionarios.getEmpresa().getId_Empresa());
		funcionario.setEmpresa(empresaEntity);

		return funcionarioDao.inserir(funcionario);
	}

	public FuncionarioEntity atualizarFuncionario(FuncionarioEntity funcionario) throws Exception {

		if (funcionarioDao.existeFuncionario(funcionario.getId_funcionario())) {

			return funcionarioDao.inserir(funcionario);

		} else {

			throw new FuncionarioNaoEncontradoAtualizarExceptions();
		}
	}
}
