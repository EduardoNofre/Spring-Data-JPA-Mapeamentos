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
@Table(name = "Aula")
public class AulaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Schema(description = "Id.", example = "123", required = true)
	@Column(name = "id_aula", length = 9)
	private Integer id_aula;

	@Schema(description = "aula.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name = "aula", length = 100)
	private String aula;

	@Schema(description = "Professor Nome.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name = "ProfessorNome", length = 100)
	private String ProfessorNome;

}
