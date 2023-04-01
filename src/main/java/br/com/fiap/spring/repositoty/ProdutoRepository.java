package br.com.fiap.spring.repositoty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.spring.model.Produto;




public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	
	List<Produto> findByNome(String prod);
	
	List<Produto> findByNovo(boolean prod);

	List<Produto> findByNomeAndNovo(String prod, boolean novo);
	
	List<Produto> findByPrecoGreaterThan(double preco);
	
}