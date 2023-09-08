# FOI ENCONTRADO UM PROBLEMA NA RESOLUÇÃO ACEITA PELA PLATAFORMA ONDE A MERLHOR SOLUÇÃO ENCONTRADA POR MIM PARA O PROBLEMA PROPOSTO FOI RESOLVIDA AQUI NESSE REPOSITÓRIO.

# Descrição

Você foi contratado por um banco para desenvolver um programa que auxilie seus clientes a realizar depósitos em suas contas. O programa deve solicitar ao cliente o valor do depósito e verificar se o valor é válido. Se o valor for maior do que zero, o programa deve adicionar o valor ao saldo da conta. Caso contrário, o programa deve exibir uma mensagem de erro e solicitar um novo valor. O programa deve continuar solicitando valores de depósito até que seja digitado um valor válido.

# ****Entrada****

O programa deve utilizar o `Scanner` para receber os valores de depósito digitados pelo cliente. Os valores podem ser decimais, representando valores em reais.

# Saída

O programa deve exibir uma mensagem de sucesso quando um valor de depósito válido for informado e o saldo da conta for atualizado. Caso um valor inválido seja digitado, o programa deve exibir uma mensagem de erro e solicitar um novo valor.

# Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.


| Entrada | Saída |
| --- | --- |
| 500.50 <br><br><br> -100 <br><br> 0 | Deposito realizado com sucesso! <br> Saldo atual: R$ 500.50 <br><br> Valor invalido! Digite um valor maior que zero. <br><br> Encerrando o programa... |

# Solução aceita pela plataforma:

```java
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
```

# Minha solução:

```java
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
```