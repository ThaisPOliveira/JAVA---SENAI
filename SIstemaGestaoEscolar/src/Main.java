import models.Aluno;
import models.Escola;
import models.Professor;


public class Main {
    public static void main(String[] args) {

        Escola escola = new Escola ("Escola Senai");
        Aluno aluno1 = new Aluno("Thais Pereira de Oliveira",19,"B50");
        Aluno aluno2 = new Aluno("Taina Kasai Serafim",19,"A56");
        Aluno aluno3 = new Aluno("Stefany Vitoria Alexandre Nascimento",19,"C85");

        Professor professor1 = new Professor("Francisco Oliveira","Java", 50);
        Professor professor2 = new Professor("Maria de Fatima","Educação Infantil",50);


        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        escola.adicionarProfessor(professor1);
        escola.adicionarProfessor(professor2);

        escola.listarAlunos();
        escola.listarProfessores();

    }
}