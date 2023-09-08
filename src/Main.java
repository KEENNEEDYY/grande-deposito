import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        double valor = scanner.nextDouble();
        scanner.nextLine();
        double saldo = 0.0;

        if (valor < 0) {
            //TODO: Imprimir a mensagem de encerrar o programa.
             do{
                System.out.println("Valor invalido! Digite um valor maior que zero.");
                valor = scanner.nextDouble();
                scanner.nextLine();
             }while(valor < 0);
        }
        if (valor > 0) {
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
            saldo =+ valor;
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + df.format(saldo));             
        } else {
            //TODO: Imprimir a mensagem de valor inválido.
            System.out.println("Encerrando o programa...");            
        }
    }
}