/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.ftsuda82.agendaweb.entity;

import java.util.Date;

/**
 *
 * @author fernando.tsuda
 */
public class Pessoa {

    private Long id;
    private String nome;
    private Date dtNascimento;
    private String email;
    private String telefone;
    private Date dtCadastro;

    public Pessoa() {
    }

    public Pessoa(String nome, Date dtNascimento, String email, String telefone) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    public Pessoa(Long id, String nome, Date dtNascimento, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

}
