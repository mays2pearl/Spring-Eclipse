package com.backgames.backgames.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity 
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "O atributo é obrigatorio!")
	@Size(min = 5, max = 100, message ="O atibuto deve ter no minimo 5 caracteres e no maximo 100 caracteres")
	private String nome;
	
	@NotNull(message = "O atributo é obrigatorio!")
	@Size(min = 5, max = 100, message ="O atibuto deve ter no minimo 5 caracteres e no maximo 100 caracteres")
	private String plataforma;
	
	@NotNull(message = "O atributo é obrigatorio!")
	@Size( message ="Passe um valor valido!")
	private long preco;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataLancamento = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne		//dia 28/09
	@JsonIgnoreProperties("produto")	
	private Categoria categoria;

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

	public long getPreco() {
		return preco;
	}

	public void setPreco(long preco) {
		this.preco = preco;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	
}
