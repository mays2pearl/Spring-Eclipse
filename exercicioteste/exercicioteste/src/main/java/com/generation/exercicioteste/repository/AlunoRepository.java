package com.generation.exercicioteste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.exercicioteste.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>  {

}
