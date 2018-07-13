package com.Silva.AppLojaVirtual.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Produto {
	@Id
	private String id;
	private String descricao;
	private Integer quntidade;
	private String codEAN;
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
		return codEAN;
	}

	public void setCodEAN(String codEAN) {
		this.codEAN = codEAN;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	

}
