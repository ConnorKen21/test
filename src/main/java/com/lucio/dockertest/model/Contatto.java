package com.lucio.dockertest.model;

import java.io.Serializable;

public class Contatto implements Serializable{
	private static final long serialVersionUID = -5204515859359278283L;

	private String nome;
	private String cognome;
	private String username;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Contatto() {
	}
	public Contatto(String nome, String cognome, String username) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
	}
	
	
}
