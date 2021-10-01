package com.drogafarma.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drogafarma.farmacia.model.Categoria;



public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List <Categoria> findAllByNomeContainingIgnoreCase(String nome);
	
}