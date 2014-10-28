package com.camaleao.cardapio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Estado {

	@Id
	@GeneratedValue
	private int id;
	
	private String nome;
	
	private String UF;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public int getId() {
		return id;
	}

}
