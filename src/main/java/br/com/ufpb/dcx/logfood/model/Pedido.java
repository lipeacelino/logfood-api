package br.com.ufpb.dcx.logfood.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@JsonManagedReference
	@ManyToOne
	private Estabelecimento estabelecimento;
	
	@JsonManagedReference
	@OneToMany
	private List<ItemPedido> itens;
	
	public Pedido() {
		
	}

	public Pedido(Long id,
			Estabelecimento estabelecimento) {
		this.id = id;
		this.estabelecimento = estabelecimento;
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

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	
}