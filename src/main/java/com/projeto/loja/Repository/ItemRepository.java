package com.projeto.loja.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projeto.loja.Model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

    @Query(value = "SELECT * FROM item WHERE cesta_id = ?1", nativeQuery = true)
    List<Item> getPerOrder(int cesta_id);

}
