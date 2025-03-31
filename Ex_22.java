/******************************************************************************
22)Faça um programa que receba a idade e o sexo de sete pessoas e que calcule e mostre:
A idade média do grupo;
A idade média das mulheres;
A idade média dos homens;
*******************************************************************************/
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalIdade = 0;
        int totalHomens = 0, totalMulheres = 0;
        int idadeHomens = 0, idadeMulheres = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            char sexo;
            while (true) {
                System.out.print("Digite o sexo (M/F): ");
                sexo = scanner.next().trim().toUpperCase().charAt(0);
                if (sexo == 'M' || sexo == 'F') {
                    break;
                } else {
                    System.out.println("Entrada inválida! Digite M para masculino ou F para feminino.");
                }
            }

            totalIdade += idade;

            if (sexo == 'M') {
                totalHomens++;
                idadeHomens += idade;
            } else if (sexo == 'F') {
                totalMulheres++;
                idadeMulheres += idade;
            }
        }

        scanner.close();

        double mediaGrupo = (double) totalIdade / 7;
        double mediaHomens = totalHomens > 0 ? (double) idadeHomens / totalHomens : 0;
        double mediaMulheres = totalMulheres > 0 ? (double) idadeMulheres / totalMulheres : 0;
        System.out.println("\nResultados:");
       
        System.out.printf("Idade média do grupo: %.2f anos\n", mediaGrupo);
        if (totalHomens > 0) {
            System.out.printf("Idade média dos homens: %.2f anos\n", mediaHomens);
        } else {
            System.out.println("Nenhum homem foi cadastrado.");
        }
        if (totalMulheres > 0) {
            System.out.printf("Idade média das mulheres: %.2f anos\n", mediaMulheres);
        } else {
            System.out.println("Nenhuma mulher foi cadastrada.");
        }
    }
}