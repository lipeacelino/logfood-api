package br.com.ufpb.dcx.logfood.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class ItemPedido {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@JsonManagedReference
	@ManyToOne(cascade = CascadeType.ALL)
	private Produto produto;
	
	private int quantidade;
	
	public ItemPedido() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
