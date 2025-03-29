import javax.swing.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) {

        /// Entrada de dados por teclado///
//    String inputSenaiJava = JOptionPane.showInputDialog("sono");
//    int input = Integer.parseInt((inputSenaiJava));
//    input++;
//

        /// Seleciona opções///
/*
        String[] senaiValues = {"Aluno1", "Aluno2", "Aluno3"};
        String input2 = (String) JOptionPane.showInputDialog(
                null,
                "SONO",
                "Escolha um aluno",
                2,
                null,
                senaiValues,
                senaiValues[1]*/
//        );

      /// Obtendo entrada com um scanner ///
//      Scanner senaiScanner = new Scanner(System.in);
//      int x = senaiScanner.nextInt(4);
//      double y = senaiScanner.nextDouble();
//      String Z =  senaiScanner.next("sono");
//
//      senaiScanner.close();

        /// Conversão de tipos ///
//        String input = JOptionPane.showInputDialog("Digite um número:");
//        int numero = Integer.parseInt(input);
//        JOptionPane.showMessageDialog(null, "O número digitado + 1 é: " + (numero + 1));

       /// Entrada simples pelo console ///
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite seu nome: ");
//        String nome = scanner.nextLine();
//
//        System.out.println("Olá, " + nome + "!");
//
//        scanner.close();

      ///  Entrada numerica ///
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite um número inteiro: ");
//        int numero = scanner.nextInt();
//
//        System.out.println("O número digitado + 1 é: " + (numero + 1));
//
//        scanner.close();

      /// Usando scanner para arquivos ///
        
        try {
            File arquivo = new File("dados.txt");
            Scanner scanner = new Scanner(arquivo);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }



    }
    }




//}