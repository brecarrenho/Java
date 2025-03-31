/******************************************************************************
23)  Faça um programa que usando laços de repetição receba a idade e o peso de 15 pessoas. Calcule e mostre as médias dos pesos das pessoas da mesma faixa etária. As faixas etárias são: de 1 a 10 anos, de ll a 20 anos, de 21 a 30 anos e maiores de 31 anos.
*******************************************************************************/

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaPeso1_10 = 0, somaPeso11_20 = 0, somaPeso21_30 = 0, somaPeso31mais = 0;
        int qtd1_10 = 0, qtd11_20 = 0, qtd21_30 = 0, qtd31mais = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o peso (kg): ");
            double peso = scanner.nextDouble();

            if (idade >= 1 && idade <= 10) {
                somaPeso1_10 += peso;
                qtd1_10++;
            } else if (idade >= 11 && idade <= 20) {
                somaPeso11_20 += peso;
                qtd11_20++;
            } else if (idade >= 21 && idade <= 30) {
                somaPeso21_30 += peso;
                qtd21_30++;
            } else {
                somaPeso31mais += peso;
                qtd31mais++;
            }

            System.out.println();
        }

        scanner.close();

        double media1_10 = (qtd1_10 > 0) ? somaPeso1_10 / qtd1_10 : 0;
        double media11_20 = (qtd11_20 > 0) ? somaPeso11_20 / qtd11_20 : 0;
        double media21_30 = (qtd21_30 > 0) ? somaPeso21_30 / qtd21_30 : 0;
        double media31mais = (qtd31mais > 0) ? somaPeso31mais / qtd31mais : 0;

        System.out.println("\nMédias de peso por faixa etária:");
        if (qtd1_10 > 0) {
            System.out.printf("1 a 10 anos: %.2f kg\n", media1_10);
        } else {
            System.out.println("Nenhuma pessoa na faixa etária de 1 a 10 anos.");
        }

        if (qtd11_20 > 0) {
            System.out.printf("11 a 20 anos: %.2f kg\n", media11_20);
        } else {
            System.out.println("Nenhuma pessoa na faixa etária de 11 a 20 anos.");
        }

        if (qtd21_30 > 0) {
            System.out.printf("21 a 30 anos: %.2f kg\n", media21_30);
        } else {
            System.out.println("Nenhuma pessoa na faixa etária de 21 a 30 anos.");
        }

        if (qtd31mais > 0) {
            System.out.printf("31 anos ou mais: %.2f kg\n", media31mais);
        } else {
            System.out.println("Nenhuma pessoa com 31 anos ou mais.");
        }
    }
}