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

import com.api.spring.projections.app.estudo.entity.FuncionarioEntity;
import com.api.spring.projections.app.estudo.service.FuncionarioService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Validated
@RequestMapping("/api/funcionario/")
@Tag(name = "Funcionario Controller", description = "Funcionario crud API")
public class FuncionarioController {

	@Autowired
	private FuncionarioService funcionarioService;

	@Operation(summary = "Busca funcionário por id", description = "Busca funcionário por id no banco de dados", tags = {"Busca por id" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, Funcionário encontrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, Funcionário não encontrado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@GetMapping(value = "id/{id}", produces = { "application/json", "application/xml" })
	public ResponseEntity<FuncionarioEntity> buscaId(
			@Parameter(description = "id funcionario não pode esta vazio ou  nulo.", required = true) @PathVariable Integer id) throws Exception {

		return new ResponseEntity<FuncionarioEntity>(funcionarioService.buscaIdFuncionario(id), HttpStatus.OK);
	}

	@Operation(summary = "Busca todos os funcionário", description = "Busca todos os funcionário", tags = {"Busca todos" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, Funcionários encontrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, nenhum funcionário encontrado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@GetMapping(value = "todos", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<FuncionarioEntity>> buscaTodos() {

		return new ResponseEntity<List<FuncionarioEntity>>(funcionarioService.buscaTodosFuncionario(), HttpStatus.OK);
	}

	@Operation(summary = "Cadastro de funcionário", description = "Cadastro de funcionário", tags = {"Cadastro" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, Funcionários cadastrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@PostMapping(value = "cadastro/nome{nome}/idade{idade}/valor{valor}/email{email}/endereco{endereco}/cidade{cidade}/uf{uf}/municipio{municipio}", produces = { "application/json", "application/xml" })
	public ResponseEntity<FuncionarioEntity> cadastroFuncionario(
			@Parameter(description = "Nome funcionario.", required = true) @PathVariable String nome,
			@Parameter(description = "Idade funcionario.", required = true) @PathVariable Integer idade,
			@Parameter(description = "Valor salarial.", required = true) @PathVariable double valor,
			@Parameter(description = "E-mail funcionario", required = true) @PathVariable String email,
			@Parameter(description = "Endereco funcionario", required = true) @PathVariable String endereco,
			@Parameter(description = "Cidade", required = true) @PathVariable String cidade,
			@Parameter(description = "Uf", required = true) @PathVariable String uf,
			@Parameter(description = "Municipio", required = true) @PathVariable String municipio) {

		return new ResponseEntity<FuncionarioEntity>(funcionarioService.inserirFuncionario(nome,idade,valor,email,endereco,cidade,uf,municipio), HttpStatus.OK);
	}
	
	@Operation(summary = "Cadastro de funcionário", description = "Cadastro de funcionário", tags = {"Cadastro" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, Funcionário cadastrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, Funcionário não encontrado para ser atualizado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@PutMapping(value = "atualizar", produces = { "application/json", "application/xml" })
	public ResponseEntity<FuncionarioEntity> atualizaFuncionario(@RequestBody @Valid FuncionarioEntity funcionarioEntity) throws Exception {

		return new ResponseEntity<FuncionarioEntity>(funcionarioService.atualizarFuncionario(funcionarioEntity), HttpStatus.OK);
	}

	@Operation(summary = "Cadastro de funcionário", description = "Cadastro de funcionário", tags = {"Cadastro" })
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Sucesso"+
			" <br />responseCode = 200, Funcionários removido com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, Funcionário não encontrado para ser removido." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@DeleteMapping(value = "delete/{id}", produces = { "application/json", "application/xml" })
	public ResponseEntity<Boolean> deletaFuncionario(@Parameter(description = "id funcionario não pode esta vazio ou  nulo.", required = true) @PathVariable Integer id) {

		return new ResponseEntity<Boolean>(funcionarioService.removerFuncionario(id), HttpStatus.OK);
	}


}
