/******************************************************************************
49. Desenvolva um algoritmo que leia 2 vetores de 10 elementos inteiros
cada. Em seguida, calcule a soma desses vetores, guarde o resultado em um
terceiro vetor e escreva o resultado.
*******************************************************************************/
import java.util.Scanner;

public class _49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] somaVetor = new int[10];

        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor1[" + i + "]: ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor2[" + i + "]: ");
            vetor2[i] = scanner.nextInt();
            somaVetor[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("\nVetor soma:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Soma[" + i + "] = " + somaVetor[i]);
        }
    }
}