package br.com.ufpb.dcx.logfood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
import br.com.ufpb.dcx.logfood.model.Pedido;
import br.com.ufpb.dcx.logfood.service.PedidoService;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping
	public List <Pedido> getPedidos() {
		return pedidoService.getPedidos();
	}

	@GetMapping("/{id}")
	public Pedido getPedidoById (@PathVariable Long id) {
		return pedidoService.findById(id);
	}
	
	@PostMapping
	public void addPedido(@RequestBody Pedido pedido) { //Produto, pagamento, pedido
		pedidoService.addPedido(pedido);
	}
}
*/