package br.com.ufpb.dcx.logfood.dto;

import java.util.List;

import br.com.ufpb.dcx.logfood.model.Pedido;

public class ExibirPedidoListDTO {
	
	private Long id;
	private String data;
	private List<Long> itemId;
	private String status;
	
	public ExibirPedidoListDTO(Pedido ped) {
		this.id = ped.getId();
		this.status = ped.getStatus();
		this.data = ped.getData();
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Long> getItemId() {
		return itemId;
	}
	public void setItemId(List<Long> itemId) {
		this.itemId = itemId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
