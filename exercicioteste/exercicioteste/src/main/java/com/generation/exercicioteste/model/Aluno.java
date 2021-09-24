package com.generation.exercicioteste.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity //gera tabela
@Table(name = "tb_aluno") //definir nome da tabela

public class Aluno {
	
	@Id //chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_incremento
	private long id;
	
	@NotNull(message = "O atributo é obrigatorio!")
	@Size(min = 5, max = 100, message ="O atibuto deve ter no minimo 5 caracteres")
	private String nome;
	
	@NotNull(message = "O atributo é obrigatorio!")
	@Size(min = 1, max = 100, message ="O atibuto deve ter no minimo 1 caracteres")
	private String serie;
	
	@	NotNull(message = "O atributo é obrigatorio")
	private int matricula;

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

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	

}
