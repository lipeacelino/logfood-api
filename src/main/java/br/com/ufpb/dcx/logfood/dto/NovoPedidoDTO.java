package br.com.ufpb.dcx.logfood.dto;

import java.util.List;

public class NovoPedidoDTO {

	private Long id;
	private List<Long> itemId;
	private String status;
	
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
}
