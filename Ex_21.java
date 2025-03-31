/*
21)Faça um programa que receba a idade, o peso, a altura, a cor dos olhos (A – Azul, P- Preto, V- Verde e C- Castanho) e a cor dos cabelos (P – Preto, C- Castanho, L – Louro e R-Ruivo) de 20 pessoas e que calcule e mostre: A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos;
A média das idades das pessoas com altura inferior a 1,50;
A porcentagem de pessoas com olhos azuis entre a s pessoas analisadas;
A quantidade de pessoas ruivas que não possuem olhos azuis;
*/
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdPessoasPesoMenor60 = 0;
        int somaIdadeAlturaMenor150 = 0, qtdAlturaMenor150 = 0;
        int qtdOlhosAzuis = 0, qtdRuivosNaoAzuis = 0;

        int totalPessoas = 20;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o peso (kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Digite a altura (m): ");
            double altura = scanner.nextDouble();

            char corOlhos;
            while (true) {
                System.out.print("Digite a cor dos olhos (A- Azul, P- Preto, V- Verde, C- Castanho): ");
                corOlhos = scanner.next().trim().toUpperCase().charAt(0);
                if (corOlhos == 'A' || corOlhos == 'P' || corOlhos == 'V' || corOlhos == 'C') {
                    break;
                } else {
                    System.out.println("Entrada inválida! Tente novamente.");
                }
            }

            char corCabelos;
            while (true) {
                System.out.print("Digite a cor dos cabelos (P- Preto, C- Castanho, L- Louro, R- Ruivo): ");
                corCabelos = scanner.next().trim().toUpperCase().charAt(0);
                if (corCabelos == 'P' || corCabelos == 'C' || corCabelos == 'L' || corCabelos == 'R') {
                    break;
                } else {
                    System.out.println("Entrada inválida! Tente novamente.");
                }
            }

            if (idade > 50 && peso < 60) {
                qtdPessoasPesoMenor60++;
            }

            if (altura < 1.50) {
                somaIdadeAlturaMenor150 += idade;
                qtdAlturaMenor150++;
            }

            if (corOlhos == 'A') {
                qtdOlhosAzuis++;
            }

            if (corCabelos == 'R' && corOlhos != 'A') {
                qtdRuivosNaoAzuis++;
            }

            System.out.println();
        }

        scanner.close();

        double mediaIdadeAlturaMenor150 = (qtdAlturaMenor150 > 0) ? (double) somaIdadeAlturaMenor150 / qtdAlturaMenor150 : 0;

        double porcentagemOlhosAzuis = ((double) qtdOlhosAzuis / totalPessoas) * 100;

        System.out.println("\nResultados:");
        System.out.println("1) Quantidade de pessoas com mais de 50 anos e peso inferior a 60 kg: " + qtdPessoasPesoMenor60);
        System.out.printf("2) Média das idades das pessoas com altura menor que 1,50m: %.2f anos\n", mediaIdadeAlturaMenor150);
        System.out.printf("3) Porcentagem de pessoas com olhos azuis: %.2f%%\n", porcentagemOlhosAzuis);
        System.out.println("4) Quantidade de pessoas ruivas que não possuem olhos azuis: " + qtdRuivosNaoAzuis);
    }
}