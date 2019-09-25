package br.com.ufpb.dcx.logfood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufpb.dcx.logfood.dto.EditarProdutoDTO;
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
	
	public Optional<Produto> getById(Long id) {
		return produtoRepository.findById(id);
	}
	
	public void update(Long id, Produto obj) {
		Optional<Produto> objOptional = getById(id);
		if (objOptional.isPresent()) {
			Produto objDb = objOptional.get();
			objDb.setValor(obj.getValor());
			objDb.setDescricao(obj.getDescricao());
			objDb.setTitulo(obj.getTitulo());
			produtoRepository.save(objDb);
		} else {
			throw new RuntimeException("Não foi possível atualizar o Proprietario");
		}
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
	
	public Produto fromDTO(NovoProdutoDTO prodDTO) {
		Produto prod = new Produto(null, prodDTO.getTitulo(), prodDTO.getDescricao(), prodDTO.getValor(), 
				estRepository.findById(prodDTO.getEstabelecimentoId()).get());
		return prod;
	}
	
	public Produto fromDTO(EditarProdutoDTO prodDTO) {
		Produto prod = new Produto(prodDTO.getId(), prodDTO.getTitulo(), prodDTO.getDescricao(), prodDTO.getValor(), 
				estRepository.findById(prodDTO.getEstabelecimentoId()).get());
		return prod;
	
	}

}
