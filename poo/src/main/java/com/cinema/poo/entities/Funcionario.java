package com.cinema.poo.entities;

public class Funcionario extends Pessoa{
    String funcao;
    int ctps;

    public Funcionario(int id, String nome, int cpf, Endereco endereco, int dataNascimento, String funcao) {
        super(id, nome, cpf, endereco, dataNascimento);
        this.funcao = funcao;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public int getCtps() {
        return ctps;
    }
    public void setCtps(int ctps) {
        this.ctps = ctps;
    }
}
