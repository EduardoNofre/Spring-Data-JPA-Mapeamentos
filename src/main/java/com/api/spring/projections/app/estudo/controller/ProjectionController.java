package com.api.spring.projections.app.estudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.spring.projections.app.estudo.entity.FuncionarioEntity;
import com.api.spring.projections.app.estudo.service.ProjectionService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/Projection/")
@Tag(name = "Projection Controller", description = "Cliente crud API")
public class ProjectionController {

	@Autowired
	private ProjectionService projectionService;
	
	
	@Operation(summary = "Busca cliente por id", description = "Busca Projection por id no banco de dados", tags = { "Busca por id" })
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Sucesso"),
							@ApiResponse(responseCode = "400", description = "Processar a requisição"),
							@ApiResponse(responseCode = "401", description = "Não autorizado"),
							@ApiResponse(responseCode = "404", description = "Não encontrado"),
							@ApiResponse(responseCode = "500", description = "Interno sem causa mapeada."),
							@ApiResponse(responseCode = "504", description = "Gateway Time-Out") })
	@GetMapping(value  = "id/{idCliente}", produces = { "application/json", "application/xml" })
	public ResponseEntity<?> buscaId(@Parameter(description="idCliente não pode esta vazio.", required=true) @PathVariable Integer id) {
		
		FuncionarioEntity funcionarioEntity = projectionService.buscaId(id);			
		return new ResponseEntity<> (funcionarioEntity,HttpStatus.OK);
	}
}
