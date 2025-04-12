package com.escola.senai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.swing.*;

@Entity
public class Professor {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long idProfessor;
    private Spring nomeProfessor;
    private String nomeDisciplina;

    //GET

    public long getIdProfessor() {
        return idProfessor;
    }

    public Spring getNomeProfessor() {
        return nomeProfessor;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    //SET

    public void setIdProfessor(long idProfessor) {
        this.idProfessor = idProfessor;
    }

    public void setNomeProfessor(Spring nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
}
