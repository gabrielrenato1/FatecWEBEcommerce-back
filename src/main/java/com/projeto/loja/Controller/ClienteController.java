package com.projeto.loja.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.loja.Model.Cliente;
import com.projeto.loja.Repository.ClienteRepository;


@CrossOrigin(origins = "*")
@RestController
public class ClienteController {
    @Autowired
    ClienteRepository bd;

    @PostMapping("/api/cliente")
    public String gravar(@RequestBody Cliente obj){
        return "O cliente foi gravado!";
    }

    // @PutMapping("/api/cliente")
    // public String alterar(@RequestBody Cliente obj){
    //     return "O cliente"+ obj.getNome() + "foi alterado!";
    // }

    @PostMapping("/api/login")
    public Cliente login(@RequestBody Cliente cliente){
        return bd.login(cliente.email, cliente.password);
    }

}
