package br.com.ufpb.dcx.logfood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufpb.dcx.logfood.dto.NovoProdutoDTO;
import br.com.ufpb.dcx.logfood.model.Produto;
import br.com.ufpb.dcx.logfood.repository.EstabelecimentoRepository;
import br.com.ufpb.dcx.logfood.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private EstabelecimentoRepository estRepository;
	
	public void save(Produto produto) {
		produtoRepository.save(produto);
	}
	 
	
	public Produto fromDTO(NovoProdutoDTO prodDTO) {
		//Optional<Estabelecimento> est = estRepository.findById(prodDTO.getEstID()).get();
		Produto prod = new Produto(null, prodDTO.getTitulo(), prodDTO.getDescricao(), prodDTO.getValor(), 
				estRepository.findById(prodDTO.getEstabelecimentoId()).get());
		return prod;
	}
	
	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}

	public void delete(Long id) {
		Optional<Produto> prod = produtoRepository.findById(id);
		if (prod.isPresent()) {
			produtoRepository.deleteById(id);
		} 
	}
	
	

}
