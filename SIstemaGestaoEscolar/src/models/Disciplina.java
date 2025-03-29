package models;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private Professor professor;

    public Disciplina(String nome, int cargaHoraria, Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public void exibirDetalhes() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Professor Responsável: " + professor.getNomeProfessor());
    }
}

