package models;

import java.util.ArrayList;

public class Escola {
    private String nomeEscola;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professors;

    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;

        this.alunos = new ArrayList<>();
        this.professors = new ArrayList<>();
    }
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void adicionarProfessor(Professor professor){
        professors.add(professor);
    }

    public void listarAlunos() {
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void listarProfessores() {
        System.out.println("Lista de Professores:");
        for (Professor professor : professors) {
            System.out.println(professor);
        }
    }
}
