package com.backgames.backgames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backgames.backgames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List <Produto> findAllByNomeContainingIgnoreCase(String nome);
	

}
