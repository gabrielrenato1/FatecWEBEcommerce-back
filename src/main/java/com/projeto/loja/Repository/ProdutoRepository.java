package com.projeto.loja.Repository;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projeto.loja.Model.Produto;

@Repository
public interface ProdutoRepository extends
JpaRepository<Produto, Integer>{
    @Query(value = "select * from produto where codigo between ?1 and ?2", nativeQuery = true)
    Optional<List<Produto>> listarVitrine(int codigoInicial, int codigoFinal);

    @Query(value = "select * from produto where nome LIKE %?1%", nativeQuery = true)
    Optional<List<Produto>> busca(String nome);

}
