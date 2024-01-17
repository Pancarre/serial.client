package com.example;

/**
 * studente
 */
public class studente {

    String nome;
    String cognome;
    String data;
    
    public studente(){}

    public studente(String nome, String cognome, String data) {
        this.nome = nome;
        this.cognome = cognome;
        this.data = data;
    }

    public String toString(){

        String s = "{" + "nome" +nome + "," + "cognome" + cognome + "}";

        return s;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getData() {
        return data;
    }




}