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
	
    private Integer quantidade;
	
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
	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public String getCodean() {
		return codean;
	}


	public void setCodean(String codean) {
		this.codean = codean;
	}

	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}

}
