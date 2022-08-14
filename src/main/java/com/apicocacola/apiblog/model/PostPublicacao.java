package com.apicocacola.apiblog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagem")
public class PostPublicacao {
	
	// Atributos e variaveis
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long id; 

	@NotNull
	@Size(min = 5, max = 50)
	private String titulo;

	@Size(min = 5, max = 5000)
	private String texto;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private User usuario;
	
	//getters and setters

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	// Metodos get e set
	
	
}
