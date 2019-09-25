package br.com.ufpb.dcx.logfood.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private String data;
	private String status;
	
	/*
	//@JsonManagedReference
	@ManyToOne
	private Estabelecimento estabelecimento;
	*/
	//@JsonManagedReference
	@OneToMany
	private List<ItemPedido> itens;
	
	public Pedido() {
		
	}

	public Pedido(Long id, List<ItemPedido> itens) {
		this.id = id;
		this.itens = itens;
		
	}
	
	public Pedido(Long id) {
		this.id = id;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}