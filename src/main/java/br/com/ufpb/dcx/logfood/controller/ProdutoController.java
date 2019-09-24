package br.com.ufpb.dcx.logfood.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufpb.dcx.logfood.dto.EditarProdutoDTO;
import br.com.ufpb.dcx.logfood.dto.ExibirProdutoDTO;
import br.com.ufpb.dcx.logfood.dto.NovoProdutoDTO;
import br.com.ufpb.dcx.logfood.model.Produto;
import br.com.ufpb.dcx.logfood.service.ProdutoService;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@PostMapping
	public void addProduto(@RequestBody NovoProdutoDTO prodDTO) {
		Produto produto = produtoService.fromDTO(prodDTO);
		produtoService.save(produto);
	}
	
	@GetMapping
	public List<ExibirProdutoDTO> getProdutos() {
		List<Produto> lista = produtoService.findAll();
		List<ExibirProdutoDTO> listaDTO = lista.stream()
				.map(obj -> new ExibirProdutoDTO(obj)).collect(Collectors.toList());
		return listaDTO;
	}
	
	@PutMapping(value="/{id}")
	public void updateProduto(@RequestBody EditarProdutoDTO objDTO, @PathVariable Long id) {
		Produto produto = produtoService.fromDTO(objDTO);
		produto.setId(id);
		produtoService.update(id, produto);
	}
	
	@DeleteMapping("/{id}")
	public void delProduto(@PathVariable("id") Long id) {
		produtoService.delete(id);
	}
}
