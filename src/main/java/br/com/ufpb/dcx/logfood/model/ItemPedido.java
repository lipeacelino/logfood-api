package br.com.ufpb.dcx.logfood.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class ItemPedido {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	//@JsonManagedReference
	@ManyToOne(cascade = CascadeType.ALL)
	private Produto produto;
	
	//@JsonBackReference
	@JsonIgnore
	@ManyToOne
	private Pedido pedido;
	
	//@JsonManagedReference
	@ManyToOne(cascade = CascadeType.ALL)
	private Cliente cliente;
	
	private int quantidade;

	public ItemPedido() {
		
	}
	
	public ItemPedido(Long id, Produto produto, Cliente cliente, int quantidade) {
		this.id = id;
		this.produto = produto;
		this.cliente = cliente;
		this.quantidade = quantidade;
	}

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public Pedido getPedido() {
		return pedido;
	}


	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
