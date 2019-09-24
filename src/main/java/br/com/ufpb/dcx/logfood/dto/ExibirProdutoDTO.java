package br.com.ufpb.dcx.logfood.dto;

import br.com.ufpb.dcx.logfood.model.Produto;

public class ExibirProdutoDTO {
	
	private Long id;
	private String titulo;
	private String descricao;
	private double valor;
	
	private Long estabelecimentoId;
	
	public ExibirProdutoDTO() {
		
	}
	
	public ExibirProdutoDTO(Produto prod) {
		this.id = prod.getId();
		this.titulo = prod.getTitulo();
		this.descricao = prod.getDescricao();
		this.valor = prod.getValor();
		this.estabelecimentoId = prod.getEstabelecimento().getId();
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

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Long getEstabelecimentoId() {
		return estabelecimentoId;
	}

	public void setEstabelecimentoId(Long estabelecimentoID) {
		this.estabelecimentoId = estabelecimentoID;
	}


}
