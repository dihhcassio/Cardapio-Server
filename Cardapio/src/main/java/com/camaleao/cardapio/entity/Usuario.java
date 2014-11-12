package com.camaleao.cardapio.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Usuario {

	
	
	
	@Id
	@GeneratedValue
	private int id;
	
	private String nome;
	
	private String login;
	
	private String senha;

	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY)
	private List<Compra> compras;
	
	@OneToMany(fetch=FetchType.EAGER)
	private List<Contato> contatos;

	public Usuario(){
		this.compras = new ArrayList<Compra>();
		this.contatos = new ArrayList<Contato>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public int getId() {
		return id;
	}
	
	

}
