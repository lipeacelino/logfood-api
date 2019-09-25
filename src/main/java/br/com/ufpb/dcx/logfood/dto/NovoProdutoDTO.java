package br.com.ufpb.dcx.logfood.dto;

import br.com.ufpb.dcx.logfood.model.Cliente;

public class NovoProdutoDTO {

	private Long id;
	private String titulo;
	private String descricao;
	private double valor;
	private Cliente cliente;
	
	private Long estabelecimentoId;

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

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Long getEstabelecimentoId() {
		return estabelecimentoId;
	}

	public void setEstabelecimentoId(Long estId) {
		this.estabelecimentoId = estId;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
