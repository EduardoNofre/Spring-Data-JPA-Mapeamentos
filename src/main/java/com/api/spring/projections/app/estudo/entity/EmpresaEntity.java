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
@Table(name = "empresa")
public class EmpresaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Schema(description = "id_Empresa.", example = "123", required = true)
	@Column(name = "id_Empresa", length = 9)
	private Integer id_Empresa;

	@Schema(description = "Nome.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name = "nome", length = 100)
	private String nome;

	@Schema(description = "nomeFantasia.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name = "nomeFantasia", length = 100)
	private String nomeFantasia;

	@Schema(description = "cnpj.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name = "cnpj", length = 100)
	private String cnpj;

}
