package com.camaleao.cardapio.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Loja {

	@Id
	@GeneratedValue
	private int id;
	
	private String nome;
	
	private String descricao;
	
	@OneToMany
	private List<Endereco> endereco;
	
	@OneToOne
	private Usuario administrado;

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

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public Usuario getAdministrado() {
		return administrado;
	}

	public void setAdministrado(Usuario administrado) {
		this.administrado = administrado;
	}

	public int getId() {
		return id;
	}
	
	

}
