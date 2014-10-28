package com.camaleao.cardapio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produto {

	@Id
	@GeneratedValue
	private int id;
	
	private String nome;
	
	private String descricao;
	
	private float valor;
	
	private String imagem;

	
	@ManyToOne
	private Categoria categia;
	
	@ManyToOne
	private Loja loja;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public int getId() {
		return id;
	}
	
	
}
