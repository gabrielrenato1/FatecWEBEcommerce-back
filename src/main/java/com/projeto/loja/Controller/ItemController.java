package com.projeto.loja.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.loja.Model.Item;
import com.projeto.loja.Repository.ItemRepository;

@CrossOrigin(origins = "*")
@RestController
public class ItemController {
    @Autowired
    ItemRepository bd;

    @PostMapping("/api/item")
    public String gravar(@RequestBody Item obj){
        return "O item"+ obj.getCodigo() + "foi gravado!";
    }

    @GetMapping("/api/itens")
    public List<Item> todos(){
        return new ArrayList<Item>();
    }

}
