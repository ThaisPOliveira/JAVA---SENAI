package com.escola.senai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAluno;
    private String nomeAluno;
    private int idadeAluno;
    private String matriculaAluno;

    //GET
    public Long getIdAluno() {
        return idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    //SET
    public void setIdAluno(Long idAluno) {
        this.idAluno = idAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }
}
