package com.cinema.poo.entities;

public class Contato {
    int telefoneFixo;
    int telefoneCelular;
    int zapZap;
    String email;
    String instagram;
    Pessoa contatoEmergencia;
    
    // Construtor para o Cliente
    public Contato(int telefoneFixo, int telefoneCelular, int zapZap, String email, String instagram) {
        this.telefoneFixo = telefoneFixo;
        this.telefoneCelular = telefoneCelular;
        this.zapZap = zapZap;
        this.email = email;
        this.instagram = instagram;
    }
    //Construtor para o Funcionário
    public Contato(int telefoneFixo, int telefoneCelular, int zapZap, String email, Pessoa contatoEmergencia) {
        this.telefoneFixo = telefoneFixo;
        this.telefoneCelular = telefoneCelular;
        this.zapZap = zapZap;
        this.email = email;
        this.contatoEmergencia = contatoEmergencia;
    }
    public int getTelefoneFixo() {
        return telefoneFixo;
    }
    public void setTelefoneFixo(int telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }
    public int getTelefoneCelular() {
        return telefoneCelular;
    }
    public void setTelefoneCelular(int telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }
    public int getZapZap() {
        return zapZap;
    }
    public void setZapZap(int zapZap) {
        this.zapZap = zapZap;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Pessoa getContatoEmergencia() {
        return contatoEmergencia;
    }
    public void setContatoEmergencia(Pessoa contatoEmergencia) {
        this.contatoEmergencia = contatoEmergencia;
    }
}
