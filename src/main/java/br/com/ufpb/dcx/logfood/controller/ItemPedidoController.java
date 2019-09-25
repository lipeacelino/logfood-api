package br.com.ufpb.dcx.logfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	
	
}
