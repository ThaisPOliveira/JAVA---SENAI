package models;

public class Fabricante extends Modelo {

    public Long id;

    public String Modelo;
    public int ano;


    @Override
    public void veiculodoAno(){
        System.out.println("Carro de corrida xyz");
    }
}
