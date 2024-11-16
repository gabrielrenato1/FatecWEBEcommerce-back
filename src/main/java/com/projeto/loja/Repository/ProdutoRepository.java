package com.projeto.loja.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projeto.loja.Model.Produto;

@Repository
public interface ProdutoRepository extends
JpaRepository<Produto, Integer>{

    @Query(value = "SELECT * FROM produto WHERE name LIKE ?1", nativeQuery = true)
    Optional<List<Produto>> search(String nome);

}
