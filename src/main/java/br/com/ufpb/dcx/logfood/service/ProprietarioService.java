package br.com.ufpb.dcx.logfood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufpb.dcx.logfood.model.Proprietario;
import br.com.ufpb.dcx.logfood.repository.ProprietarioRepository;

@Service
public class ProprietarioService {

	@Autowired
	private ProprietarioRepository proprietarioRepository;
	
	public void save(Proprietario proprietario) {
		proprietarioRepository.save(proprietario);
	}
	
	public Optional<Proprietario> getById(Long id) {
		return proprietarioRepository.findById(id);
	}
	
	public List<Proprietario> findAll() {
		return proprietarioRepository.findAll();
	}

	public void delete(Long id) {
		Optional<Proprietario> cliente = getById(id);
		if(cliente.isPresent()) {
			proprietarioRepository.deleteById(id);
		}
	}

	public void attProprietario(Long id, Proprietario proprietario) {
		Optional<Proprietario> propOptional = getById(id);
		if (propOptional.isPresent()) {
			Proprietario propDb = propOptional.get();
			propDb.setNome(proprietario.getNome());
			propDb.setEmail(proprietario.getEmail());
			propDb.setSenha(proprietario.getSenha());
			proprietarioRepository.save(propDb);
		} else {
			throw new RuntimeException("Não foi possível atualizar o Proprietario");
		}
	}

}
