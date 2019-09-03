package br.com.ufpb.dcx.logfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufpb.dcx.logfood.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
