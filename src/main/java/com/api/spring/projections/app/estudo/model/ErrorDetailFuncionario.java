package com.api.spring.projections.app.estudo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDetailFuncionario {

    private Integer code;
    private String description;
    private String field;
}
