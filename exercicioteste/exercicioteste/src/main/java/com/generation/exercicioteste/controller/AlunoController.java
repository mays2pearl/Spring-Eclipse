package com.generation.exercicioteste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.exercicioteste.model.Aluno;
import com.generation.exercicioteste.repository.AlunoRepository;

@RestController
@RequestMapping("/aluno")
@CrossOrigin(origins = "*", allowedHeaders = "*") //libera o acesso do frontEnd

public class AlunoController {

	@Autowired
	private AlunoRepository alunoRepository;

	@GetMapping
	public ResponseEntity <List<Aluno>> getAll(){
		return ResponseEntity.ok(alunoRepository.findAll()); // é igual select * from
	
}
}
