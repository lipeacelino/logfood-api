package br.com.ufpb.dcx.logfood.dto;

import br.com.ufpb.dcx.logfood.model.Estabelecimento;

public class ExibirEstabelecimentoDTO {
	
	private Long id;
	private String nome;
	private String categoria;
	private String descricao;
	private Long proprietarioId;
	
	public ExibirEstabelecimentoDTO(Estabelecimento est) {
		this.id = est.getId();
		this.nome = est.getCategoria();
		this.descricao = est.getCategoria();
		this.categoria = est.getCategoria();
		this.proprietarioId = est.getProprietario().getId();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getProprietarioId() {
		return proprietarioId;
	}

	public void setProprietarioId(Long proprietarioId) {
		this.proprietarioId = proprietarioId;
	}
	
}
