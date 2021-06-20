package com.api.spring.projections.app.estudo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.spring.projections.app.estudo.entity.EmpresaEntity;
import com.api.spring.projections.app.estudo.service.EmpresaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Validated
@RequestMapping("/api/empresa")
@Tag(name = "Empresa Controller", description = "Empresa crud API")
public class EmpresaController {

	@Autowired
	private EmpresaService empresaService;

	@Operation(summary = "Busca empresa por id", description = "Busca empresa por id no banco de dados", tags = {"Busca por id" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, Funcionário encontrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, Funcionário não encontrado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@GetMapping(value = "id/{id}", produces = { "application/json", "application/xml" })
	public ResponseEntity<EmpresaEntity> buscaId(
			@Parameter(description = "id empresa não pode esta vazio ou  nulo.", required = true) @PathVariable Integer id) throws Exception {

		return new ResponseEntity<EmpresaEntity>(empresaService.buscaIdEmpresa(id), HttpStatus.OK);
	}

	@Operation(summary = "Busca todos os empresa", description = "Busca todos os empresa", tags = {"Busca todos" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, Empresa encontrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, nenhum empresa encontrado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@GetMapping(value = "todos", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<EmpresaEntity>> buscaTodos() {

		return new ResponseEntity<List<EmpresaEntity>>(empresaService.buscaTodosEmpresa(), HttpStatus.OK);
	}

	@Operation(summary = "Cadastro de empresa", description = "Cadastro de empresa", tags = {"Cadastro" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, Empresa cadastrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@PostMapping(value = "cadastro/nome{nome}/nomeFantasia{nomeFantasia}/cnpj{cnpj}", produces = { "application/json", "application/xml" })
	public ResponseEntity<EmpresaEntity> cadastroEmpresa(
			@Parameter(description = "Nome empresa.", required = true) @PathVariable String nome,
			@Parameter(description = "Idade empresa.", required = true) @PathVariable String nomeFantasia,
			@Parameter(description = "Valor salarial.", required = true) @PathVariable String cnpj) {

		return new ResponseEntity<EmpresaEntity>(empresaService.inserirEmpresa(nome, nomeFantasia, cnpj), HttpStatus.OK);
	}
	
	@Operation(summary = "Cadastro de empresa", description = "Cadastro de empresa", tags = {"Cadastro" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, Funcionário cadastrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, Funcionário não encontrado para ser atualizado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@PutMapping(value = "atualizar", produces = { "application/json", "application/xml" })
	public ResponseEntity<EmpresaEntity> atualizaEmpresa(@RequestBody @Valid EmpresaEntity empresaEntity) throws Exception {

		return new ResponseEntity<EmpresaEntity>(empresaService.atualizarEmpresa(empresaEntity), HttpStatus.OK);
	}

	@Operation(summary = "Cadastro de empresa", description = "Cadastro de empresa", tags = {"Cadastro" })
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Sucesso"+
			" <br />responseCode = 200, Empresa removido com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, Funcionário não encontrado para ser removido." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@DeleteMapping(value = "delete/{id}", produces = { "application/json", "application/xml" })
	public ResponseEntity<Boolean> deletaEmpresa(@Parameter(description = "id empresa não pode esta vazio ou  nulo.", required = true) @PathVariable Integer id) throws Exception {

		return new ResponseEntity<Boolean>(empresaService.removerEmpresa(id), HttpStatus.OK);
	}




	
}
