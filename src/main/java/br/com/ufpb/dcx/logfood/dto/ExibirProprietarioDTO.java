package br.com.ufpb.dcx.logfood.dto;

import br.com.ufpb.dcx.logfood.model.Proprietario;

public class ExibirProprietarioDTO {
	
	private Long id;
	private String nome;
	private String email;
	
	public ExibirProprietarioDTO(Proprietario prop) {
		this.id = prop.getId();
		this.nome = prop.getNome();
		this.email = prop.getEmail();
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
