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

    @PostMapping("/api/register")
    public Cliente gravar(@RequestBody Cliente obj){
        return bd.save(obj);
    }

    @PostMapping("/api/login")
    public Cliente login(@RequestBody Cliente cliente){
        return bd.login(cliente.email, cliente.password);
    }

}
