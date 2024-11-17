package com.projeto.loja.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projeto.loja.Model.Cliente;

// @Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

    @Query(value = "SELECT * FROM cliente WHERE email = ?1 AND password = ?2", nativeQuery = true)
    Cliente login(String email, String password);

}
