package com.camaleao.cardapio.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Compra {

	@Id
	@GeneratedValue
	private int id;
	
	private float valor;
	
	private Date data;
	
	@ManyToOne
	private Usuario usuario;
	
	@ManyToOne
	private Loja loja;
	
	@OneToMany
	private List<Produto> produtos;

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
