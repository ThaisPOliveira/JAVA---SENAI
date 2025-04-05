import models.Academia;
import models.Cliente;

public class Main {
    public static void main(String[] args) {
        Academia academia = new Academia("FitAcadem");

        Cliente cliente = new Cliente("Thais Linda", 56);

        academia.adicionarPessoa(cliente);

    }
}