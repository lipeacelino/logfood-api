package br.com.ufpb.dcx.logfood.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
	
	@JsonBackReference
	@ManyToOne
	private Pedido pedido;
	
	private String endereco;
	private double numero;
	private String cidade;
	private String estado;
	
	public ItemPedido() {
		
	}
	
	public ItemPedido(long id, Produto produto, int quantidade, Pedido pedido, String endereco, double numero,
			String cidade, String estado) {
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
		this.pedido = pedido;
		this.endereco = endereco;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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
