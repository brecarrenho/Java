/******************************************************************************

12 - Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.

*******************************************************************************/
import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita o ano de nascimento do rapaz
        System.out.print("Informe o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Obtem o ano atual
        int anoAtual = 2025;

        // Calcula a idade
        int idade = anoAtual - anoNascimento;

        // Verifica a situação de alistamento
        if (idade < 18) {
            // Mostra quantos anos faltam para o alistamento
            int anosFaltando = 18 - idade;
            System.out.printf("Faltam %d anos para o alistamento militar.\n", anosFaltando);
        } else if (idade == 18) {
            // Se tem exatamente 18 anos
            System.out.println("Você deve se alistar neste ano.");
        } else {
            // Mostra quantos anos já se passaram do alistamento
            int anosPassados = idade - 18;
            System.out.printf("Você já deveria ter se alistado há %d anos.\n", anosPassados);
        }

        // Fecha o scanner
        scanner.close();
    }
}