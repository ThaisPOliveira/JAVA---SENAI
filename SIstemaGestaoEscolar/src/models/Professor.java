package models;

public class Professor {
    private String nomeProfessor;
    private String disciplinaProfessor;
    private int idadeProfessor;


    public Professor(String nomeProfessor, String disciplinaProfessor, int idadeProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.disciplinaProfessor = disciplinaProfessor;
        this.idadeProfessor = idadeProfessor;
    }

    public int getIdadeProfessor() {
        return idadeProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getDisciplinaProfessor() {
        return disciplinaProfessor;
    }


    @Override
    public String toString(){
        return "Professor{"+ nomeProfessor + '\'' +
                "Nome" + idadeProfessor +  '\'' +
                "Disciplina" + disciplinaProfessor +"}";
    }
}
