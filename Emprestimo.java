/******************************************************************************

5 - Simulador de empréstimo com juros compostos
Peça ao usuário um valor de empréstimo e em quantas parcelas deseja pagar. Calcule o valor final com juros compostos de 2% ao mês. Mostre o valor final e o valor de cada parcela. Permita simular vários empréstimos.


*******************************************************************************/
import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o valor do empréstimo (0 para sair): ");
            double valor = sc.nextDouble();
            if (valor == 0) break;

            System.out.print("Digite o número de parcelas: ");
            int parcelas = sc.nextInt();

            double taxa = 0.02;
            double valorFinal = valor * Math.pow(1 + taxa, parcelas);
            double valorParcela = valorFinal / parcelas;

            System.out.printf("Valor final com juros: R$ %.2f\n", valorFinal);
            System.out.printf("Valor de cada parcela: R$ %.2f\n", valorParcela);
        }

        sc.close();
    }
}
