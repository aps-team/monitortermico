package br.com.practicalsolutions.monitortermico.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Autorizacao {

	@Id
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
