package com.apicocacola.apiblog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apicocacola.apiblog.model.PostPublicacao;

public interface PostPublicacaoRepository extends JpaRepository<PostPublicacao, Long>{
	
	public List<PostPublicacao> findAllByTituloContainingIgnoreCase(String titulo);
}
