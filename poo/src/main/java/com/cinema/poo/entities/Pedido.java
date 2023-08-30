package com.cinema.poo.entities;

public class Pedido {
    int id;
    Cliente cliente;
    Funcionario funcionario;
    String data;
    String hora;
    double valorTotal;
    
    public Pedido(int id, Cliente cliente, Funcionario funcionario, String data, String hora, double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data = data;
        this.hora = hora;
        this.valorTotal = valorTotal;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
