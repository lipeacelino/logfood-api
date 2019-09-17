package br.com.ufpb.dcx.logfood.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	//isso poderia ser uma entidade Endereço, mas daria mais trabalho haha
	private String endereco;
	private double numero;
	private String cidade;
	private String estado;
	
	@ManyToMany
	private List<Produto> produtos;
	/**
	 * o que falta fazer: a relação entre pedido produto e estabelecimento
	 */
	@JsonManagedReference
	@ManyToOne
	private Estabelecimento estabelecimento;
	
	public Pedido() {
		
	}

	public Pedido(Long id, String endereco, double numero, String cidade, String estado, List<Produto> produtos,
			Estabelecimento estabelecimento) {
		this.id = id;
		this.endereco = endereco;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.produtos = produtos;
		this.estabelecimento = estabelecimento;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	
}