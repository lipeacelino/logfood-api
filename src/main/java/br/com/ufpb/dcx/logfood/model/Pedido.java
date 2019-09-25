package br.com.ufpb.dcx.logfood.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd, MM, yyyy : hh:mm:ss");
	private String data;
	private String status;
	
	
	//@JsonManagedReference
	@ManyToOne
	private Estabelecimento estabelecimento;
	
	//@JsonManagedReference
	@OneToMany
	private List<ItemPedido> itens;
	
	public Pedido() {
		this.data = sdf.format(new Date());
	}

	public Pedido(Long id,
			Estabelecimento estabelecimento) {
		this.id = id;
		this.estabelecimento = estabelecimento;
		this.data = sdf.format(new Date());
	}

	public Pedido(Long id, Estabelecimento estabelecimento, List<ItemPedido> itens) {
		this.id = id;
		this.estabelecimento = estabelecimento;
		this.itens = itens;
		this.data = sdf.format(new Date());
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