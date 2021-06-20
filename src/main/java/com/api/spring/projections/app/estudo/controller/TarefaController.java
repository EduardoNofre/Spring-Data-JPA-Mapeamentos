package com.api.spring.projections.app.estudo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.spring.projections.app.estudo.entity.TarefaEntity;
import com.api.spring.projections.app.estudo.service.TarefaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Validated
@RequestMapping("/api/tarefa")
@Tag(name = "Tarefa Controller", description = "tarefa crud API")
public class TarefaController {
	
	@Autowired
	private TarefaService TarefaService;
	
	@Operation(summary = "Busca todos os Tarefa", description = "Busca todos os Tarefa", tags = {"Busca todos" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, Tarefa encontrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, nenhum Tarefa encontrado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@GetMapping(value = "todos", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<TarefaEntity>> buscaTodos() {

		return new ResponseEntity<List<TarefaEntity>>(TarefaService.buscaTodasTarefa(), HttpStatus.OK);
	}
	
	@Operation(summary = "Cadastro de Tarefa", description = "Cadastro de Tarefa", tags = {"Cadastro" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, Tarefa cadastrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, Tarefa não encontrado para ser atualizado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@PostMapping(value = "atualizar", produces = { "application/json", "application/xml" })
	public ResponseEntity<TarefaEntity> cadastroFuncionario(@RequestBody @Valid TarefaEntity TarefaEntity) throws Exception {

		return new ResponseEntity<TarefaEntity>(TarefaService.cadastroTarefa(TarefaEntity), HttpStatus.OK);
	}

}
