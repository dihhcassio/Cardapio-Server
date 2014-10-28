package com.camaleao.cardapio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cidade {

	@Id
	@GeneratedValue
	private int id;
	
	private String nome;
	
	@ManyToOne	
	private Estado estado;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
