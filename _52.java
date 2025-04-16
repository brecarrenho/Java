/******************************************************************************

52. Faça um programa que leia 5 idades de pessoas, armazeno-os em um Array,
calcule e apresente a soma das idades.
Verificar as idades e apresentar se a pessoa é " Melhor idade", " Adulto" ou "Criança".


*******************************************************************************/
import java.util.Scanner;

public class _52 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       
        int[] idades = new int[5];
        int soma = 0;

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            soma += idades[i];
        }

        System.out.println("\nSoma das idades: " + soma);
       
        System.out.println("\nClassificação das pessoas:");
        for (int i = 0; i < idades.length; i++) {
            String classificacao;
            if (idades[i] >= 60) {
                classificacao = "Melhor idade";
            } else if (idades[i] >= 18) {
                classificacao = "Adulto";
            } else {
                classificacao = "Criança";
            }
            System.out.println("Pessoa " + (i + 1) + ": " + idades[i] + " anos - " + classificacao);
        }
    }
}