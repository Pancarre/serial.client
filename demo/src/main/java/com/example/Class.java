package com.example;

import java.util.ArrayList;

/**
 * Class
 */
public class Class {

    
    int numero;
    String sezione;
    String aula;
    ArrayList<studente> alunni;

    public Class(){}

    public Class(int numero, String sezione, String aula) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
        this.alunni = new ArrayList<>();
    }

    public void add(studente s){

        alunni.add(s);

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public void setAlunni(ArrayList<studente> alunni) {
        this.alunni = alunni;
    }

    public int getNumero() {
        return numero;
    }

    public String getSezione() {
        return sezione;
    }

    public String getAula() {
        return aula;
    }

    public ArrayList<studente> getAlunni() {
        return alunni;
    }

    




}