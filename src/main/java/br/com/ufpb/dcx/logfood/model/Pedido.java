package br.com.ufpb.dcx.logfood.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Date data = new Date();
	
	@ManyToMany
	@JoinTable(name="PEDIDO_PRODUTO",
			joinColumns = @JoinColumn(name="pedido_id"),
			inverseJoinColumns = @JoinColumn(name="produto_id"))
	private List<Produto> produtos = new ArrayList<>(); 
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
}
