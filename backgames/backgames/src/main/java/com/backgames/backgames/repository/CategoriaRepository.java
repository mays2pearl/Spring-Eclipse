package com.backgames.backgames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backgames.backgames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List <Categoria> findAllByNomeContainingIgnoreCase(String nome);
	
}