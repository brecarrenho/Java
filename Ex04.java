/******************************************************************************

4. A empresa XKW concedeu um bônus de 20%
do valor do salário a todos os funcionários com tempo de trabalho na empresa
igual ou superior a 5 anos e de 10% aos demais. Faça um algoritmo que receba o
salário e o tempo de serviço de um funcionário, calcule e mostre o valor do
bônus recebido por ele.

*******************************************************************************/
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário do funcionário
        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        // Solicita o tempo de serviço do funcionário
        System.out.println("Digite o tempo de serviço do funcionário (em anos):");
        double tempo = scanner.nextDouble();

        // Calcula o novo salário baseado no tempo de serviço
        if (tempo >= 5) {
            salario += salario * 0.20; // Aumento de 20%
        } else {
            salario += salario * 0.10; // Aumento de 10%
        }

        // Exibe o novo salário
        System.out.println("O novo salário do funcionário é: R$ " + salario);

        // Fecha o Scanner
        scanner.close();
    }
}
