package br.com.ufpb.dcx.logfood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufpb.dcx.logfood.dto.NovoItemPedidoDTO;
import br.com.ufpb.dcx.logfood.model.ItemPedido;
import br.com.ufpb.dcx.logfood.repository.ClienteRepository;
import br.com.ufpb.dcx.logfood.repository.ItemPedidoRepository;
import br.com.ufpb.dcx.logfood.repository.ProdutoRepository;

@Service
public class ItemPedidoService {
	
	@Autowired
	ItemPedidoRepository itemPedidoRep;
	@Autowired
	ProdutoRepository prodRepository;
	@Autowired
	ClienteRepository clienteRepository;
	
	public void save(ItemPedido produto) {
		itemPedidoRep.save(produto);
	}

	public ItemPedido fromDTO(NovoItemPedidoDTO itemDTO) {
		ItemPedido item = new ItemPedido(null, prodRepository.findById(itemDTO.getProdutoId()).get(), 
				clienteRepository.findById(itemDTO.getClienteId()).get(),
				itemDTO.getQuantidade());
		return item;
	}

	public List<ItemPedido> findAll() {
		return itemPedidoRep.findAll();
	}

	public Optional<ItemPedido> getById(Long id) {
		return itemPedidoRep.findById(id);
	}

	public void delete(Long id) {
		itemPedidoRep.deleteById(id);
		
	}
	
	//falta o delete e put
}
