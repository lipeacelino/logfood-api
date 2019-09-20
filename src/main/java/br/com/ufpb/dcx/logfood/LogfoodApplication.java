package br.com.ufpb.dcx.logfood;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.ufpb.dcx.logfood.model.Estabelecimento;
import br.com.ufpb.dcx.logfood.model.Produto;
import br.com.ufpb.dcx.logfood.model.Proprietario;
import br.com.ufpb.dcx.logfood.repository.EstabelecimentoRepository;
import br.com.ufpb.dcx.logfood.repository.ProdutoRepository;

@SpringBootApplication
public class LogfoodApplication implements CommandLineRunner{
	
	@Autowired
	ProdutoRepository produtoRepository;
	@Autowired
	EstabelecimentoRepository estabelecimentoRepository;
	//PedidoRepository pedidoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(LogfoodApplication.class, args);
	}
	
	/**
	 * o que falta fazer: a relação entre pedido produto e estabelecimento
	 */
	
	@Override
	public void run(String... args) throws Exception {
		
		Estabelecimento est1 = new Estabelecimento(null, "Pizzaria do dedé", "Pizzaria", "Pizzas baratas e gostosas");
		Estabelecimento est2 = new Estabelecimento(null, "Padaria Céu Azul", "Padaria", "Pães e lanches");
		Estabelecimento est3 = new Estabelecimento(null, "Lanchonete ponto x", "Lanches", "lanches deliciosos");
		
		Produto prod1 = new Produto(null, "Hambúrguer de bacon", "Hamburguer, salada e bacon", 8.00, est1);
		Produto prod2 = new Produto(null, "Hambúrguer vegano", "Hamburguer de soja e salada", 9.00, est2);
		Produto prod3 = new Produto(null, "Hambúrguer", "Hamburguer e salada", 3.00, est3);
		
		
		est1.setProdutos((Arrays.asList(prod1)));
		est2.setProdutos((Arrays.asList(prod2)));
		est3.setProdutos((Arrays.asList(prod3)));
		
		//produtoRepository.saveAll(Arrays.asList(prod1, prod2, prod3));
		estabelecimentoRepository.saveAll(Arrays.asList(est1, est2, est3));
		
		/*
		prod1.setEstabelecimento(est1);
		prod2.setEstabelecimento(est2);
		prod3.setEstabelecimento(est3);
		produtoRepository.saveAll(Arrays.asList(prod1,prod2,prod3));		
		*/
		
		//pedidoRepository.saveAll(Arrays.asList(ped1, ped2, ped3));
	}
}
