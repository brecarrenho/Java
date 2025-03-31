/******************************************************************************

18) Leia a idade de 20 pessoas e exiba a soma das idade, a média das idades e quantas pessoas são maiores de idade.

*******************************************************************************/
import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int maioresDeIdade = 0;
        int numeroPessoas = 20;

        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            somaIdades += idade;

            if (idade >= 18) {
                maioresDeIdade++;
            }
        }

        double mediaIdades = somaIdades / (double) numeroPessoas;

        System.out.println("\nSoma das idades: " + somaIdades);
        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Número de pessoas maiores de idade: " + maioresDeIdade);

        scanner.close();
    }
}