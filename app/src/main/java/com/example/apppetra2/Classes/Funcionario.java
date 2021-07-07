package com.example.apppetra2.Classes;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Funcionario implements Serializable {
    public Integer id;
    private String nome;
    private String cpf;
    private String dataNasc;
    private String telefone;
    private String matricula;
    private String endereco;
    private String senha;

    public Funcionario() {
    }

//    public Funcionario(Integer id) {
//        this.id = id;
//    }

    public Funcionario(String nome, String cpf, String dataNasc, String telefone, String matricula, String endereco, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.matricula = matricula;
        this.endereco = endereco;
        this.senha = senha;
    }

    public Funcionario(Integer id, String nome, String cpf, String dataNasc, String telefone, String matricula, String endereco, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.matricula = matricula;
        this.endereco = endereco;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString(){
        return nome;
    }
}
