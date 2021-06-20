package com.api.spring.projections.app.estudo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.spring.projections.app.estudo.entity.CozinhaEntity;
import com.api.spring.projections.app.estudo.entity.FuncionarioEntity;
import com.api.spring.projections.app.estudo.service.CozinhaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Validated
@RequestMapping("/api/cozinha")
@Tag(name = "Cozinha Controller", description = "cozinha crud API")
public class CozinhaController {
	
	@Autowired
	private CozinhaService cozinhaService;
	
	@Operation(summary = "Busca todos os cozinha", description = "Busca todos os cozinha", tags = {"Busca todos" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, cozinha encontrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, nenhum cozinha encontrado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@GetMapping(value = "Todos", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<CozinhaEntity>> buscaTodos() {

		return new ResponseEntity<List<CozinhaEntity>>(cozinhaService.buscaTodasCozinha(), HttpStatus.OK);
	}
	
	@Operation(summary = "Cadastro de cozinha", description = "Cadastro de cozinha", tags = {"Cadastro" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""+
			" <br />responseCode = 200, cozinha cadastrado com sucesso" + 
			" <br />responseCode = 400, Erro processar a requisição" + 
			" <br />responseCode = 401, Não autorizado." + 
			" <br />responseCode = 404, cozinha não encontrado para ser atualizado." +
			" <br />responseCode = 500, Erro interno sem causa mapeada." +
			" <br />responseCode = 504, Gateway Time-Out." 
			)})
	@PostMapping(value = "Atualizar", produces = { "application/json", "application/xml" })
	public ResponseEntity<CozinhaEntity> cadastroFuncionario(@RequestBody @Valid CozinhaEntity cozinhaEntity) throws Exception {

		return new ResponseEntity<CozinhaEntity>(cozinhaService.cadastroCozinha(cozinhaEntity), HttpStatus.OK);
	}

}
