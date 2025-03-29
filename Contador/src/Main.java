import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File arquivo = new File("texto.txt");
            Scanner scanner = new Scanner(arquivo);

            int contador = 0;

            while (scanner.hasNext()) {
                scanner.next();
                contador++;
            }

            System.out.println("O arquivo contém " + contador + " palavras.");

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}

