package com.projeto.loja.Model;

import java.util.Optional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int codigo;
    public int produto_id;
    @Transient
    public Optional<Produto> produto;
    public int cesta_id;
    @Transient
    public Cesta cesta;
    public int quantidade;
    public float valor;
    
    public int getProdutoId() {
        return produto_id;
    }

    public void setProdutoId(int produtoId) {
        this.produto_id = produtoId;
    }

    public Optional<Produto> getProduto() {
        return produto;
    }

    public void setProduto(Optional<Produto> produto) {
        this.produto = produto;
    }

    public int getCestaId() {
        return cesta_id;
    }

    public void setCestaId(int cestaId) {
        this.cesta_id = cestaId;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
