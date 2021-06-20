package com.api.spring.projections.app.estudo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Tarefa")
public class TarefaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Schema(description = "id_tarefa.", example = "123", required = true)
	@Column(name = "id_tarefa", length = 9)
	private Integer id_tarefa;

	@Schema(description = "tarefa.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name = "tarefa", length = 100)
	private String tarefa;
}
