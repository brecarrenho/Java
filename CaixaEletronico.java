/******************************************************************************

4 - Caixa eletrônico com cédulas disponíveis
Simule um caixa eletrônico. O usuário informa o valor do saque, e o programa informa quantas cédulas de 
R$100, R$50, R$20, R$10 e R$5 serão entregues, com base nas cédulas disponíveis. 
Caso não seja possível realizar o saque com as cédulas, exiba uma mensagem de erro.


*******************************************************************************/
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cedulas = {100, 50, 20, 10, 5};

        System.out.print("Digite o valor do saque: ");
        int valor = sc.nextInt();
        int valorInicial = valor;
        int[] resultado = new int[cedulas.length];

        for (int i = 0; i < cedulas.length; i++) {
            resultado[i] = valor / cedulas[i];
            valor %= cedulas[i];
        }

        if (valor != 0) {
            System.out.println("Não é possível sacar esse valor com as cédulas disponíveis.");
        } else {
            System.out.println("Saque de R$" + valorInicial + ":");
            for (int i = 0; i < cedulas.length; i++) {
                if (resultado[i] > 0) {
                    System.out.println(cedulas[i] + " reais: " + resultado[i] + " cédula(s)");
                }
            }
        }

        sc.close();
    }
}