import model.Calculadora;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        System.out.println("Seja bem vindo a nossa calculadora!");
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        int n2 = scanner.nextInt();
        System.out.printf("Escolha a operação desejada: %n 1-soma %n 2-subtração %n 3-divisão %n 4-multiplicação");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                int resul = calc.soma(n1, n2);
                System.out.println("A soma dos numeros é:" + resul);
                break;

            case 2:
                int resuls = calc.subtracao(n1, n2);
                System.out.println("A subtração dos numeros é:" + resuls);
                break;

            case 3:
                int resuld = calc.divisao(n1, n2);
                System.out.println("A divisão dos numeros é:" + resuld);
                break;

            case 4:
                int resulm = calc.multiplicacao(n1, n2);
                System.out.println("A multiplicação dos numeros é:" + resulm);
                break;
        }
    }
}