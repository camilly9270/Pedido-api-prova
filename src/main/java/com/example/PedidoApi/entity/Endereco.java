package com.example.PedidoApi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Endereco {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
  private String endereco;
    private String cep;
    private Integer numero;
    private Long id;

    public Long getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Endereco(String endereco, String cep, Integer numero) {
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;
    }
}
