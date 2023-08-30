package com.cinema.poo.entities;

public class Pessoa {
    int id;
    String nome; 
    String cpf;
    Endereco endereco;
    int dataNascimento;
    Contato contato;
    
    // Construtor de Cliente e Funcionario 
    public Pessoa(int id, String nome, int cpf2, Endereco endereco, int dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf2;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
    // Construtor de Contato de Emergencia de Funcionario
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public int getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Contato getContato() {
        return contato;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public boolean validaCpf(String cpf) {
        if(cpf.length() == 11){
            return true;
        } else {
            return false;
        }
    }
}
