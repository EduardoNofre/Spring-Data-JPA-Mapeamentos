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

import com.api.spring.projections.app.estudo.entity.AulaEntity;
import com.api.spring.projections.app.estudo.service.AulaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Validated
@RequestMapping("/api/aula")
@Tag(name = "Aula Controller", description = "Aula crud API")
public class AulaController {
	
	@Autowired
	private AulaService aulaService;
	
	@Operation(summary = "Busca todos os aula", description = "Busca todos os aula", tags = {"Busca todos" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, aula encontrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, nenhum aula encontrado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@GetMapping(value = "todos", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<AulaEntity>> buscaTodos() {

		return new ResponseEntity<List<AulaEntity>>(aulaService.buscaTodasAula(), HttpStatus.OK);
	}
	
	@Operation(summary = "Cadastro de aula", description = "Cadastro de aula", tags = {"Cadastro" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, Aula cadastrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, Aula não encontrado para ser atualizado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@PostMapping(value = "atualizar", produces = { "application/json", "application/xml" })
	public ResponseEntity<AulaEntity> cadastroFuncionario(@RequestBody @Valid AulaEntity AulaEntity) throws Exception {

		return new ResponseEntity<AulaEntity>(aulaService.cadastroAula(AulaEntity), HttpStatus.OK);
	}

}
