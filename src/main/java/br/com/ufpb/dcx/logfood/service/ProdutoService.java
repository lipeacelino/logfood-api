package br.com.ufpb.dcx.logfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufpb.dcx.logfood.model.Produto;
import br.com.ufpb.dcx.logfood.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	ProdutoRepository produtoRepository;

	public void save(Produto produto) {
		produtoRepository.save(produto);
	}

	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}

}
