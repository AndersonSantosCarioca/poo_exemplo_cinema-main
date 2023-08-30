package com.cinema.poo.entities;

public class Ingresso {
    int id;
    Pedido pedido;
    //Sessao sessao;
    String tipo;
    double valor;
    
    public Ingresso(int id, Pedido pedido, String tipo, double valor) {
        this.id = id;
        this.pedido = pedido;
        this.tipo = tipo;
        this.valor = valor;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
