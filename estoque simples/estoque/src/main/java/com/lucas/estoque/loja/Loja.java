package com.lucas.estoque.loja;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Loja {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loja_id;
    private String loja_nome;
    private String loja_cidade;
    private String loja_estado;
    private int loja_numero;
    private String loja_rua;

    public Loja() {
    }

    public int getLoja_id() {
        return loja_id;
    }

    public void setLoja_id(int loja_id) {
        this.loja_id = loja_id;
    }

    public String getLoja_nome() {
        return loja_nome;
    }

    public void setLoja_nome(String loja_nome) {
        this.loja_nome = loja_nome;
    }

    public String getLoja_cidade() {
        return loja_cidade;
    }

    public void setLoja_cidade(String loja_cidade) {
        this.loja_cidade = loja_cidade;
    }

    public String getLoja_estado() {
        return loja_estado;
    }

    public void setLoja_estado(String loja_estado) {
        this.loja_estado = loja_estado;
    }

    public int getLoja_numero() {
        return loja_numero;
    }

    public void setLoja_numero(int loja_numero) {
        this.loja_numero = loja_numero;
    }

    public String getLoja_rua() {
        return loja_rua;
    }

    public void setLoja_rua(String loja_rua) {
        this.loja_rua = loja_rua;
    }

    


}
