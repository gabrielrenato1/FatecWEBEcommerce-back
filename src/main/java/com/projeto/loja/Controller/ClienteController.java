package com.projeto.loja.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.loja.Model.Cliente;

@RestController
public class ClienteController {
    @PostMapping("/api/cliente")
    public String gravar(@RequestBody Cliente obj){
        return "O cliente"+ obj.getNome() + "foi gravado!";
    }

    @PutMapping("/api/cliente")
    public String alterar(@RequestBody Cliente obj){
        return "O cliente"+ obj.getNome() + "foi alterado!";
    }

    @GetMapping("/api/cliente/{codigo}")
    public Cliente carregar(@PathVariable int codigo){
        Cliente obj = new Cliente();
        obj.setCodigo(codigo);
        obj.setNome( "maria da silva"); 
        obj.setEmail( "maria@norton.net.br");   
        return obj;
    }

    @DeleteMapping("api/cliente/{codigo}")
    public String remover(@PathVariable int codigo){
        return "Cliente"+ codigo +"removido com sucesso!";
    }

    @GetMapping("/api/clientes")
    public List<Cliente> todos(){
        return new ArrayList<Cliente>();
    }
}
