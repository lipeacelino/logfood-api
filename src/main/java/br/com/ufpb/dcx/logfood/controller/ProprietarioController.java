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

import br.com.ufpb.dcx.logfood.model.Proprietario;
import br.com.ufpb.dcx.logfood.service.ProprietarioService;

@RestController
@RequestMapping("/api/proprietarios")
public class ProprietarioController {
	
	
	@Autowired
	private ProprietarioService proprietarioService;
	
	@PostMapping
	public void save(@RequestBody Proprietario proprietario) {
		proprietarioService.save(proprietario);
	}
	
	@PutMapping(value= "/{id}")
	public void attProprietario(@PathVariable Long id, @RequestBody Proprietario proprietario) {
		proprietarioService.attProprietario(id, proprietario);
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Proprietario> getById(@PathVariable("id") Long id){
		return proprietarioService.getById(id);
	}
	
	@GetMapping
	public List<Proprietario> getProprietario() {
		return proprietarioService.findAll();
	}
	
	@DeleteMapping(value= "/{id}")
	public void delete(@PathVariable("id") Long id) {
		proprietarioService.delete(id);
	}
}
