package com.example.PedidoApi.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Pedido {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Double juros;
  private Double jurostotal;
  private String itens;

  public String getItens() {
    return itens;
  }

  public void setItens(String itens) {
    this.itens = itens;
  }

  public Double getJuros() {
    return juros;
  }

  public void setJuros(Double juros) {
    this.juros = juros;
  }

  public Double getJurostotal() {
    return jurostotal;
  }

  public void setJurostotal(Double jurostotal) {
    this.jurostotal = jurostotal;
  }

  private Long id;
    private String nome;
    private Double precoIndividual;
    private Double precoTotal;
    private Integer quanntidade;
    private String formaDePagamento;
    private Integer parcelas;
    private Double valorTotal;
    private List<Pedido>pedido;


  public Long getId() {
    return id;
  }


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getPrecoIndividual() {
    return precoIndividual;
  }

  public void setPrecoIndividual(Double precoIndividual) {
    this.precoIndividual = precoIndividual;
  }

  public Double getPrecoTotal() {
    return precoTotal;
  }

  public void setPrecoTotal(Double precoTotal) {
    this.precoTotal = precoTotal;
  }

  public Integer getQuanntidade() {
    return quanntidade;
  }

  public void setQuanntidade(Integer quanntidade) {
    this.quanntidade = quanntidade;
  }

  public String getFormaDePagamento() {
    return formaDePagamento;
  }

  public void setFormaDePagamento(String formaDePagamento) {
    this.formaDePagamento = formaDePagamento;
  }

  public Integer getParcelas() {
    return parcelas;
  }

  public void setParcelas(Integer parcelas) {
    this.parcelas = parcelas;
  }

  public List<Pedido> pedido() {
    return pedido;
  }

  public void setPedido(List<Pedido> pedido) {
    this.pedido = pedido;
  }

  public Double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(Double valorTotal) {
    this.valorTotal = valorTotal;
  }

  public Pedido(String nome, Double precoIndividual, Double precoTotal, Integer quanntidade, String formaDePagamento, Integer parcelas, Double valorTotal, List<Pedido>produtos) {
    this.nome = nome;
    this.precoIndividual = precoIndividual;
    this.precoTotal = precoTotal;
    this.quanntidade = quanntidade;
    this.formaDePagamento = formaDePagamento;
    this.parcelas = parcelas;
    this.valorTotal = valorTotal;
  }
}
