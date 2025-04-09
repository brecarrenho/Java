/******************************************************************************
39 -  Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida
ela possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa
com 19 anos possui 6935 dias de vida; veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935
DIAS.
*******************************************************************************/
import java.util.Scanner;

public class _39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        int diasdevida = idade * 365;

        System.out.println(nome.toUpperCase() + ", VOCÊ JÁ VIVEU " + diasdevida + " DIAS.");

        scanner.close();
    }
}