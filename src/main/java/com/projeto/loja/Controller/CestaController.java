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

import com.projeto.loja.Model.Cesta;

@CrossOrigin(origins = "*")
@RestController
public class CestaController {
    @PostMapping("/api/cesta")
    public String gravar(@RequestBody Cesta obj){
        return "A cesta"+ obj.getCodigo() + "foi gravada!";
    }

    @PutMapping("/api/cesta")
    public String alterar(@RequestBody Cesta obj){
        return "A cesta"+ obj.getCodigo() + "foi alterada!";
    }

    @GetMapping("/api/cesta/{codigo}")
    public Cesta carregar(@PathVariable int codigo){
        Cesta obj = new Cesta();
        obj.setCodigo(codigo);
        // obj.cliente.setNome( "maria da silva"); 
        obj.setTotal(578);   
        return obj;
    }

    @DeleteMapping("api/cesta/{codigo}")
    public String remover(@PathVariable int codigo){
        return "Cesta"+ codigo +"removida com sucesso!";
    }

    @GetMapping("/api/cestas")
    public List<Cesta> todos(){
        return new ArrayList<Cesta>();
    }
}
