package com.projeto.loja.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projeto.loja.Model.Cesta;

@Repository
public interface CestaRepository extends JpaRepository<Cesta, Integer> {

    @Query(value = "SELECT * FROM cesta WHERE id = ?1", nativeQuery = true)
    Cesta show(int codigo);

    @Query(value = "SELECT * FROM cesta WHERE cliente_id = ?1 ORDER BY codigo DESC", nativeQuery = true)
    List<Cesta> index(int user_id);

}
