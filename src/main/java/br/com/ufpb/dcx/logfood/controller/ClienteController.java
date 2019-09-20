package br.com.ufpb.dcx.logfood.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufpb.dcx.logfood.model.Cliente;
import br.com.ufpb.dcx.logfood.service.ClienteService;

@RestController
@RequestMapping("/api/clientes") 
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	public void addCliente(@RequestBody Cliente cliente) {
		clienteService.save(cliente);
	}
	
	@PutMapping(value= "/{id}")
	public void attProprietario(@PathVariable Long id, @RequestBody Cliente cliente) {
		clienteService.attCliente(id, cliente);
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Cliente> getById(@PathVariable("id") Long id){
		return clienteService.getById(id);
	}
	
	@GetMapping
	public List<Cliente> getCliente() {
		return clienteService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		clienteService.delete(id);
	}
}
