package br.com.ufpb.dcx.logfood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufpb.dcx.logfood.model.Estabelecimento;
import br.com.ufpb.dcx.logfood.service.EstabelecimentoService;


@RestController
@RequestMapping("/api/estabelecimentos")
public class EstabelecimentoController {
	
	@Autowired
	private EstabelecimentoService estabelecimentoService;
	
	@PostMapping
	public void addEstabelecimento(@RequestBody Estabelecimento estabelecimento) {
		estabelecimentoService.save(estabelecimento);
	}
	
	@GetMapping
	public List<Estabelecimento> getEstablecimentos() {
		return estabelecimentoService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delProduto(@PathVariable("id") Long id) {
		estabelecimentoService.delete(id);
	}
}
