package aula4_execicio.demo.repository;

import java.util.List;

import aula4_execicio.demo.entity.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface produtoRepository extends JpaRepository<Produto,Integer>{
    //Crie um método no ProdutoRepository  que busque todos os produtos por nome que contenham o parâmetro informado.
    List<Produto> findByNomeLike(String nome);
    //Crie um método no ProdutoRepository  que busque todos os produtos com quantidade inferior ou igual a 10.    
    List<Produto> findByQtdeLessThanEqual(Integer qtde);
    //Crie um método em ProdutoRepository que liste todos os produtos ordenados pelo nome de forma ascendente.
    List<Produto> findAllByNomeOrderByNomeAsc(String nome);
    //Crie um método em ProdutoRepository que retorne o top 10 dos produtos com maior quantidade em estoque.
    List<Produto> findTop10ByQtde(Integer qtde);

}
