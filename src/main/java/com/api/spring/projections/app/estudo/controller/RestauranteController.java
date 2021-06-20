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

import com.api.spring.projections.app.estudo.entity.RestauranteEntity;
import com.api.spring.projections.app.estudo.service.RestauranteService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Validated
@RequestMapping("/api/restaurante")
@Tag(name = "Restaurante Controller", description = "Empresa crud API")
public class RestauranteController {

	@Autowired
	private RestauranteService restauranteService;

	@Operation(summary = "Busca todos os restaurante", description = "Busca todos os restaurante", tags = {
			"Busca todos" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""
			+ " <br />responseCode = 200, restaurante encontrado com sucesso"
			+ " <br />responseCode = 400, Erro processar a requisição" + " <br />responseCode = 401, Não autorizado."
			+ " <br />responseCode = 404, nenhum restaurante encontrado."
			+ " <br />responseCode = 500, Erro interno sem causa mapeada."
			+ " <br />responseCode = 504, Gateway Time-Out.") })
	@GetMapping(value = "todos", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<RestauranteEntity>> buscaTodos() {

		return new ResponseEntity<List<RestauranteEntity>>(restauranteService.buscaTodosRestaurante(), HttpStatus.OK);
	}

	@Operation(summary = "Cadastro de restaurante", description = "Cadastro de restaurante", tags = { "Cadastro" })
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""
			+ " <br />responseCode = 200, restaurante cadastrado com sucesso"
			+ " <br />responseCode = 400, Erro processar a requisição" + " <br />responseCode = 401, Não autorizado."
			+ " <br />responseCode = 404, restaurante não encontrado para ser atualizado."
			+ " <br />responseCode = 500, Erro interno sem causa mapeada."
			+ " <br />responseCode = 504, Gateway Time-Out.") })
	@PostMapping(value = "atualizar", produces = { "application/json", "application/xml" })
	public ResponseEntity<RestauranteEntity> atualizaFuncionario(
			@RequestBody @Valid RestauranteEntity restauranteEntity) throws Exception {

		return new ResponseEntity<RestauranteEntity>(restauranteService.cadastroRestaurante(restauranteEntity),HttpStatus.OK);
	}

}