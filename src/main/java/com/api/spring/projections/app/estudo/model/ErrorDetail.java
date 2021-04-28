package com.api.spring.projections.app.estudo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorDetail {

	private ErrorDetailFuncionario errorDetailFuncionario;
}
