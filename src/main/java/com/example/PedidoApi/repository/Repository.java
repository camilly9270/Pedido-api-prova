package com.example.PedidoApi.repository;

import com.example.PedidoApi.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Pedido, Long> {

}
