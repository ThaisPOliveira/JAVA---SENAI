package models;

abstract class Instrutor extends Pessoa {
    private String especialidadeInstrutor;

    public Instrutor(String nome, int idadePessoa, String especialidadeInstrutor) {
        super(nome, idadePessoa);
        this.especialidadeInstrutor = especialidadeInstrutor;
    }

    @Override
    public String toString() {
        return "Instrutor{" +
                "especialidadeInstrutor='" + especialidadeInstrutor + '\'' +
                ", nomePessoa='" + nomePessoa + '\'' +
                ", idadePessoa=" + idadePessoa +
                '}';
    }
}
