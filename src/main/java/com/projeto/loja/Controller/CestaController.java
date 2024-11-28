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
import com.projeto.loja.Repository.CestaRepository;

@CrossOrigin(origins = "*")
@RestController
public class CestaController {
    @Autowired
    CestaRepository bd;

    @PostMapping("/api/cesta")
    public Cesta gravar(@RequestBody Cesta obj){
        bd.save(obj);
        return obj;
    }

    @GetMapping("/api/cesta/{codigo}")
    public Cesta carregar(@PathVariable int codigo){
        return bd.show(codigo);
    }

    @GetMapping("/api/cestas")
    public List<Cesta> todos(){
        return bd.index();
    }

}
