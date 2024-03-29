package br.com.ufpb.dcx.logfood.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufpb.dcx.logfood.dto.NovoPedidoDTO;
import br.com.ufpb.dcx.logfood.model.ItemPedido;
import br.com.ufpb.dcx.logfood.model.Pedido;
import br.com.ufpb.dcx.logfood.repository.ItemPedidoRepository;
import br.com.ufpb.dcx.logfood.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	PedidoRepository pedidoRepository;
	@Autowired
	ItemPedidoRepository itemRepository;
	
	
	public Optional<Pedido> findById(Long id) {
		Optional<Pedido> pedido = pedidoRepository.findById(id);
		return pedido;
	}

	public void addPedido(Pedido pedido) {
		pedidoRepository.save(pedido);
	}

	public List<Pedido> getPedidos() {
		return pedidoRepository.findAll();
	}

	public Pedido fromDTO(NovoPedidoDTO itemDTO) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd, MM, yyyy : hh:mm:ss");
		List<ItemPedido> listaItens = new ArrayList<>(); 
		Pedido item = new Pedido(null);
		for (Long p: itemDTO.getItemId()) {
			listaItens.add(itemRepository.findById(p).get());
		}
		item.setStatus(itemDTO.getStatus());
		item.setData(sdf.format(new Date()));
		item.setItens(listaItens);
		return item;
	}

	public List<Pedido> findAll() {
		return pedidoRepository.findAll();
	}

	public void delete(Long id) {
		pedidoRepository.deleteById(id);
		
	}

	public void update(Long id, Pedido pedido) {
		Optional<Pedido> pedidoOptional = findById(id);
		if (pedidoOptional.isPresent()) {
			Pedido pedidoDb = pedidoOptional.get();
			pedidoDb.setStatus(pedido.getStatus());;
			pedidoRepository.save(pedidoDb);
		} else {
			throw new RuntimeException("Não foi possível atualizar o Proprietario");
		}	
	}
}