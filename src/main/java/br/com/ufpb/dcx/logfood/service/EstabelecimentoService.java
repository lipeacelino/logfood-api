package br.com.ufpb.dcx.logfood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufpb.dcx.logfood.model.Estabelecimento;
import br.com.ufpb.dcx.logfood.repository.EstabelecimentoRepository;

@Service
public class EstabelecimentoService {
	
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;

	public void save(Estabelecimento estabelecimento) {
		estabelecimentoRepository.save(estabelecimento);
	}

	public List<Estabelecimento> findAll() {
		return estabelecimentoRepository.findAll();
	}

	public void delete(Long id) {
		Optional<Estabelecimento> prod = estabelecimentoRepository.findById(id);
		if (prod.isPresent()) {
			estabelecimentoRepository.deleteById(id);
		} 
	}

}
