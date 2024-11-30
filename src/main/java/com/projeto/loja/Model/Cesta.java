package com.projeto.loja.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.projeto.loja.Repository.ItemRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Cesta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int codigo;
    @Transient
    public Cliente cliente;
    public int cliente_id;
    public float total;
    @Transient
    public List<Item> item;

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getTotal() {
        return this.total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public int getClienteId() {
        return this.cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }
    
}
