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

import br.com.ufpb.dcx.logfood.model.Produto;
import br.com.ufpb.dcx.logfood.service.ProdutoService;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@PostMapping
	public void addProduto(@RequestBody Produto produto) {
		produtoService.save(produto);
	}
	
	@GetMapping
	public List<Produto> getProdutos() {
		return produtoService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delProduto(@PathVariable("id") Long id) {
		produtoService.delete(id);
	}
}
