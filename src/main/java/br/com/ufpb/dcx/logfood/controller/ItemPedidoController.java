package br.com.ufpb.dcx.logfood.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufpb.dcx.logfood.dto.NovoItemPedidoDTO;
import br.com.ufpb.dcx.logfood.model.ItemPedido;
import br.com.ufpb.dcx.logfood.service.ItemPedidoService;

@RestController
@RequestMapping("/api/itens")
public class ItemPedidoController {
	
	@Autowired
	ItemPedidoService itemService;

	@PostMapping
	public void addItem(@RequestBody NovoItemPedidoDTO itemDTO) {
		ItemPedido item = itemService.fromDTO(itemDTO);
		itemService.save(item);
	}
	
	@GetMapping
	public List<NovoItemPedidoDTO> getProdutos() {
		List<ItemPedido> lista = itemService.findAll();
		List<NovoItemPedidoDTO> listaDTO = lista.stream().map(obj -> new NovoItemPedidoDTO(obj))
				.collect(Collectors.toList());
		return listaDTO;
	}
	
	
	@GetMapping(value = "/{id}")
	public NovoItemPedidoDTO getById(@PathVariable("id") Long id){
		Optional<ItemPedido> obj = itemService.getById(id);
		NovoItemPedidoDTO objDTO = new NovoItemPedidoDTO(obj.get());
		return objDTO;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		itemService.delete(id);
	}
	
}
