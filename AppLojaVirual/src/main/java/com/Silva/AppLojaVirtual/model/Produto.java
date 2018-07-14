package com.Silva.AppLojaVirtual.model;


import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Produto {
	@Id
	private String id;
	
    @NotEmpty(message="Descrição não pode ser vazio")
	private String descricao;
	
    private Integer quntidade;
	
    @NotEmpty(message="EAN do produto deve ser preenchido")
	private String codean;
	
    private String valor;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuntidade() {
		return quntidade;
	}

	public void setQuntidade(Integer quntidade) {
		this.quntidade = quntidade;
	}
	
	public String getCodEAN() {
		return codean;
	}

	public void setCodEAN(String codEAN) {
		this.codean = codEAN;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
