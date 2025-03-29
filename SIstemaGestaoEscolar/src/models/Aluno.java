package models;

public class Aluno {
    private String nomeAluno;
    private int idadeAluno;
    private String matriculaAluno;

    public Aluno(String nomeAluno, int idadeAluno, String matriculaAluno) {
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.matriculaAluno = matriculaAluno;
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
    @Override
    public String toString() {
        return "Aluno: " + nomeAluno + ", Idade: " +
                idadeAluno + ", " +
                "Matrícula: " + matriculaAluno;
    }

}
