package com.backgames.backgames.model;

import java.math.BigDecimal;

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
	private BigDecimal preco;
	
	@NotNull(message = "O atributo é obrigatorio!")
	@Size(min = 1, max = 100, message ="Passe um valor valido!")
	private String dataLancamento;
	
	@ManyToOne		//dia 28/09
	@JsonIgnoreProperties("produto")	
	private Categoria categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;

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

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}
