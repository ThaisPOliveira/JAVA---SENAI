import models.Academia;
import models.Cliente;
import models.Instrutor;

public class Main {
    public static void main(String[] args) {
        Academia academia = new Academia("FitAcadem");

        Cliente cliente = new Cliente("Thais Linda", 56,"Basic");
        Instrutor instrutor = new Instrutor("Thais Linda", 56,"Basic");

        academia.adicionarPessoa(cliente);

    }
}