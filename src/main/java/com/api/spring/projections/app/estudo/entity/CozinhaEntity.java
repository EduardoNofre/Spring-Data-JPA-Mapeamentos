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
@Table(name = "cozinha")
public class CozinhaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Schema(description = "Id.", example = "123", required = true)
	@Column(name="id_cozinha", length = 9)
	private Integer id;
	
	@Schema(description = "Nome.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name="nome", length = 100)
	private String nome;
	
	@Schema(description = "especialidade.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name="especialidade", length = 100)
	private String especialidade;
}
