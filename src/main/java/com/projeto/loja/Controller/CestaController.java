package com.projeto.loja.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.loja.Model.Cesta;
import com.projeto.loja.Model.Item;
import com.projeto.loja.Repository.CestaRepository;
import com.projeto.loja.Repository.ItemRepository;
import com.projeto.loja.Repository.ProdutoRepository;

@CrossOrigin(origins = "*")
@RestController
public class CestaController {
    @Autowired
    CestaRepository bd;
    @Autowired
    ItemRepository itemRepository;
    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping("/api/cesta")
    public Cesta gravar(@RequestBody Cesta obj){
        bd.save(obj);
        return obj;
    }

    @GetMapping("/api/cesta/{codigo}")
    public Cesta carregar(@PathVariable int codigo){
        return bd.show(codigo);
    }

    @GetMapping("/api/cesta/cliente/{user_id}")
    public List<Cesta> todos(@PathVariable int user_id){

        List<Cesta> cestas = bd.index(user_id);

        for (Cesta cesta : cestas) {

            cesta.setItem(itemRepository.getPerOrder(cesta.codigo));

            for(Item item : cesta.getItem()){

                item.setProduto(produtoRepository.findById(item.getProdutoId()));


            }
            
        }
            
        return cestas;
    }   

}
