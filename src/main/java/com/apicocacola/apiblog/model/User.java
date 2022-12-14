package com.apicocacola.apiblog.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.media.Schema;



@Entity
@Table(name = "tb_usuario")
public class User {
	// Atributos e variaveis
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		@NotNull
		@Size(min = 2, max = 100)
		private String nome;
		@Schema(example = "email@email.com")
		@NotNull
		@Size(min = 4, max = 100)
		private String usuario;
		@NotNull
		@Size(min = 5, max = 100)
		private String senha;

		private String foto;

		private String tipo;
		
		@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
		@JsonIgnoreProperties("usuario")
		private List<PostPublicacao> postagem;
		
		//Methods getters and setters

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getFoto() {
			return foto;
		}

		public void setFoto(String foto) {
			this.foto = foto;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public List<PostPublicacao> getPostagem() {
			return postagem;
		}

		public void setPostagem(List<PostPublicacao> postagem) {
			this.postagem = postagem;
		}

}
