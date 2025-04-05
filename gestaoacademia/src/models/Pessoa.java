package models;

    abstract class Pessoa {
    protected String nomePessoa;
    protected int idadePessoa;

    public Pessoa(String nome, int idadePessoa) {
        this.nomePessoa = nome;
        this.idadePessoa = idadePessoa;
    }

    public String getNome() {
        return nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public abstract  String getDescricao();

}
