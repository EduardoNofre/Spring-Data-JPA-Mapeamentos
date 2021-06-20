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
@Table(name = "refeicao")
public class RefeicaoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Schema(description = "Id_refeicao.", example = "123", required = true)
	@Column(name="Id_refeicao", length = 9)
	private Integer Id_refeicao;
	
	@Schema(description = "tipo.", example = "123", required = true)
	@Size(max = 50)
	@Column(name="tipo", length = 100)
	private Integer tipo;
	
	@Schema(description = "valor.", example = "100.00", required = true)
	@Size(max = 50)
	@Column(name="valor", length = 100)
	private double valor;
	
	@ManyToOne
	@JoinColumn(name="FUNCIONARIO_ID",  nullable = false)
	private FuncionarioEntity funcionario;
}
