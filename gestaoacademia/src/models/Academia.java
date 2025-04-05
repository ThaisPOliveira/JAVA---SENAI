package models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Academia {
    private String nomeAcademia;
    private ArrayList<Pessoa> pessoas;

    public Academia(String nomeAcademia) {
        this.nomeAcademia = nomeAcademia;
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa)
    {
        pessoas.add(pessoa);
    }

    public void listaPessoas(){
        System.out.println("Lista de pessoas na academia");
        for (Pessoa pessoa: pessoas){
            System.out.println(pessoa.getDescricao());
        }
    }
}
