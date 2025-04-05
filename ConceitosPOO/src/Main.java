import models.Carro;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Carro carro = new Carro();

      carro.modelo = "Civic";
      carro.ano = 2005;
      carro.cor = "Blue";
      carro.exibirInformacao();



    }
}