package com.projeto.loja.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.loja.Model.Item;

@CrossOrigin(origins = "*")
@RestController
public class ItemController {
    @PostMapping("/api/item")
    public String gravar(@RequestBody Item obj){
        return "O item"+ obj.getCodigo() + "foi gravado!";
    }

    @PutMapping("/api/item")
    public String alterar(@RequestBody Item obj){
        return "O item"+ obj.getCodigo() + "foi alterado!";
    }

    @GetMapping("/api/item/{codigo}")
    public Item carregar(@PathVariable int codigo){
        Item obj = new Item();
        obj.setCodigo(codigo);
        // obj.produto.setNome( "Cadeira Gamer"); 
        obj.setQuantidade(2);   
        return obj;
    }

    @DeleteMapping("api/item/{codigo}")
    public String remover(@PathVariable int codigo){
        return "Item"+ codigo +"removido com sucesso!";
    }

    @GetMapping("/api/itens")
    public List<Item> todos(){
        return new ArrayList<Item>();
    }
}
