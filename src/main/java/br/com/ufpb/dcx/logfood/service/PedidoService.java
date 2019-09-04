package br.com.ufpb.dcx.logfood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufpb.dcx.logfood.model.Pedido;
import br.com.ufpb.dcx.logfood.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	public Optional<Pedido> findById(Long id) {
		return pedidoRepository.findById(id);
	}

	public void addPedido(Pedido pedido) {
		pedidoRepository.save(pedido);
	}

	public List<Pedido> getPedidos() {
		return pedidoRepository.findAll();
	}

}
