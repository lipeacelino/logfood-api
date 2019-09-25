package br.com.ufpb.dcx.logfood.dto;

import br.com.ufpb.dcx.logfood.model.ItemPedido;

public class NovoItemPedidoDTO {
	
	private Long id;
	private int quantidade;
	
	private Long produtoId;
	private Long clienteId;
	
	public NovoItemPedidoDTO (ItemPedido obj) {
		this.id = obj.getId();
		this.quantidade = obj.getQuantidade();
		this.produtoId = obj.getProduto().getId();
		this.clienteId = obj.getProduto().getId();
	}
	
	public NovoItemPedidoDTO(Long id, int quantidade, Long clienteId, Long produtoId) {
		this.id = id;
		this.quantidade = quantidade;
		this.clienteId = clienteId;
		this.produtoId = produtoId;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Long getClienteId() {
		return clienteId;
	}
	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}
	public Long getProdutoId() {
		return produtoId;
	}
	public void setProdutoId(Long produtoId) {
		this.produtoId = produtoId;
	}
	
}
