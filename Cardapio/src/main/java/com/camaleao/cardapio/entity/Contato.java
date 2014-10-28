package com.camaleao.cardapio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.camaleao.cardapio.enumerado.EnumContato;

@Entity
public class Contato {

	@Id
	@GeneratedValue
	private int id;
	
	private EnumContato tipo;
	
	private String conteudo;

	public EnumContato getTipo() {
		return tipo;
	}

	public void setTipo(EnumContato tipo) {
		this.tipo = tipo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public int getId() {
		return id;
	}
	
	

}
