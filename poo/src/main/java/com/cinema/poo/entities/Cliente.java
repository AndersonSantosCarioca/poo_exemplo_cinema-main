package com.cinema.poo.entities;

public class Cliente extends Pessoa {
    int numCartaoFidelidade;
    static int geradorNumeroCartaoFidelidade = 1000;

    public Cliente(int id, String nome, int cpf, Endereco endereco, int dataNascimento, int numCartaoFidelidade) {
        super(id, nome, cpf, endereco, dataNascimento);
        this.numCartaoFidelidade = numCartaoFidelidade;
    }
    public int getNumCartaoFidelidade() {
        return numCartaoFidelidade;
    }
    public void setNumCartaoFidelidade(int numCartaoFidelidade) {
        this.numCartaoFidelidade = numCartaoFidelidade;
    }
    public static int getGeradorNumeroCartaoFidelidade() {
        return geradorNumeroCartaoFidelidade;
    }
    public static void setGeradorNumeroCartaoFidelidade(int geradorNumeroCartaoFidelidade) {
        Cliente.geradorNumeroCartaoFidelidade = geradorNumeroCartaoFidelidade;
    } 
}
