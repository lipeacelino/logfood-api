package br.com.ufpb.dcx.logfood.dto;

import br.com.ufpb.dcx.logfood.model.Cliente;

public class ExibirClienteDTO {

	private Long id;
	private String nome;
	private String email;
	
	public ExibirClienteDTO() {
		
	}
	
	public ExibirClienteDTO(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.email = cliente.getEmail();
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
