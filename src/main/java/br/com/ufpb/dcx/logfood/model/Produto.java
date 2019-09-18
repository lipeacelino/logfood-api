package br.com.ufpb.dcx.logfood.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String titulo;
	private String descricao;
	private double valor;
	
	@JsonManagedReference
	@ManyToOne
	private Estabelecimento estabelecimento;
	
	@ManyToMany
	private List<Pedido> pedido;
	
	@JsonBackReference
	@OneToMany
	private List<ItemPedido> item;
	
	public Produto() {
		
	}
	
	public Produto(Long id, String titulo, String descricao, double valor) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	
	public Produto(Long id, String titulo, String descricao, double valor, Estabelecimento estabelecimento) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.valor = valor;
		this.estabelecimento = estabelecimento;
	}

	/*
	@ManyToMany(mappedBy = "produtos")
	private List<Pedido> pedidos = new ArrayList<>(); 
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	*/
	
	
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}
	
	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
