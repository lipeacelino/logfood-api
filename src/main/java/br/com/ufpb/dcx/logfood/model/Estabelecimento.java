package br.com.ufpb.dcx.logfood.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Estabelecimento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String categoria;
	private String descricao;
	
	//@JsonBackReference
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL)
	private List<Pedido> pedido;

	//@JsonBackReference
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL)
	private List<Produto> produtos = new ArrayList<>();
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Proprietario proprietario;

	public Estabelecimento() {

	}

	public Estabelecimento(Long id, String nome, String categoria, String descricao) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.descricao = descricao;
	}

	public Estabelecimento(Long id, String nome, String categoria, String descricao, Proprietario prop) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.descricao = descricao;
		this.proprietario = prop;
	}
	
	
	
	public Estabelecimento(Long id, String nome, String categoria, String descricao, List<Pedido> pedido,
			List<Produto> produtos, Proprietario proprietario) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.descricao = descricao;
		this.pedido = pedido;
		this.produtos = produtos;
		this.proprietario = proprietario;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public String getNome() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	
	
}
