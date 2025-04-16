/******************************************************************************
48. Desenvolva um algoritmo que leia um conjunto de 10 valores reais, guarde-os
em um vetor, calcule a soma dos valores armazenados em posicões ímpares
e escreva o resultado.
*******************************************************************************/
import java.util.Scanner;

public class _48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[10];
        double soma = 0;

        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
            if (i % 2 != 0) { // posição ímpar (índice 1, 3, 5, ...)
                soma += valores[i];
            }
        }

        System.out.println("\nSoma dos valores nas posições ímpares: " + soma);
    }
}
