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
    public List<Item> gravar(@RequestBody List<Item> obj){
        return bd.saveAll(obj);
    }

    @GetMapping("/api/item")
    public List<Item> todos(){
        return new ArrayList<Item>();
    }

}
