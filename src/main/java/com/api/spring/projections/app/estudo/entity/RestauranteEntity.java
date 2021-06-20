package com.api.spring.projections.app.estudo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "restaurante")
public class RestauranteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Schema(description = "id_restaurante.", example = "123", required = true)
	@Column(name="id_restaurante", length = 9)
	private Integer id_restaurante;
	
	@Schema(description = "Nome.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name="nome", length = 100)
	private String nome;

	@ManyToOne
	@JoinColumn(name="cozinha_id", nullable=false)
	private CozinhaEntity cozinha;
}
