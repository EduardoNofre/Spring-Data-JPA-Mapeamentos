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
@Table(name = "Funcionario")
public class FuncionarioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Schema(description = "Id.", example = "123", required = true)
	@Column(name="id", length = 9)
	private Integer id;
	
	@Schema(description = "Nome.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name="nome", length = 100)
	private String nome;
	
	@Schema(description = "idade.", example = "123", required = true)
	@Size(max = 50)
	@Column(name="idade", length = 100)
	private Integer idade;
	
	@Schema(description = "valor.", example = "100.00", required = true)
	@Size(max = 50)
	@Column(name="valor", length = 100)
	private double valor;
	
	@Schema(description = "email.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name="email", length = 100)
	private String email;
	
	@Schema(description = "endereco.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name="endereco", length = 100)
	private String endereco;
	
	@Schema(description = "cidadee.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name="cidade", length = 100)
	private String cidade;
	
	@Schema(description = "uf.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name="uf", length = 100)
	private String uf;
	
	@Schema(description = "municipio.", example = "abc", required = true)
	@Size(max = 50)
	@Column(name="municipio", length = 100)
	private String municipio;

}
