package models;

import java.util.ArrayList;

public class Escola {
    private String nomeEscola;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professors;
    private ArrayList<Turma> turma;
    private ArrayList<Disciplina> disciplina;

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

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public void setTurma(ArrayList<Turma> turma) {
        this.turma = turma;
    }

    public void listaTurmas(){
        System.out.println("Lista das turmas");
        for (Turma turma : turma) {
            System.out.println(turma);
        }
    }

    public void listaDisciplina(){
        System.out.println("Lista das disciplinas");
        for (Disciplina disciplina : disciplina){
            System.out.println(disciplina);
        }
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
