package models;

public class Cliente extends Pessoa{

    private String planoCliente;


    public Cliente(String nome, int idadePessoa, String planoCliente) {
        super(nome, idadePessoa);
        this.planoCliente = planoCliente;}


    public String getPlanoCliente() {
        return planoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nomePessoa='" + nomePessoa + '\'' +
                ", idadePessoa=" + idadePessoa +
                ", plano Cliente=" + planoCliente +
                '}';
    }
}
