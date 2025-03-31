/******************************************************************************

19) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.

*******************************************************************************/
import java.util.Scanner;

public class Ex_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }

        System.out.println("\nA pessoa mais nova é: " + nomeMaisNovo);

        scanner.close();
    }
}