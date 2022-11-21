package com.example.PedidoApi.controller;

import com.example.PedidoApi.entity.Pedido;
import com.example.PedidoApi.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "pedido/v1/")
public class Controller {
    @Autowired
    Repository repository;
    @PostMapping
    public Pedido create(@RequestBody @Valid Pedido pedido){
        Pedido pedidoSalvo = repository.save(pedido);
        return pedidoSalvo;
    }
    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Pedido> deletePedidoById(@PathVariable Long id){
        Optional<Pedido> pedidoReturn = repository.findById(id);
        return pedidoReturn;
    }
    @DeleteMapping("/{id}")
    public String deletePedido (@PathVariable Long id) {
        Optional<Pedido> pedido = Optional.of(repository.getById(id));
        if (pedido.isPresent()) {
            repository.deleteById(id);
            return "pedido " + " deletado com sucesso!";
        } else {
            return "Pedido de " + id + "não existe!";
        }
    }
        public List<Pedido> produtos () {
            return repository.findAll();

        }
    }
