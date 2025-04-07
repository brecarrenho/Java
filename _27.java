/******************************************************************************
27. Faça um programa, utilizando while, que permita o usuário escrever o nome de cinco pessoas e os mostre na tela.
*******************************************************************************/
import java.util.Scanner;
public class Ex_27 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
       
        String[] nomes = new String[5];
       
        int i = 0;
       
        while (i < 5) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();  
            i++;  
        }

        System.out.println("\nOs nomes inseridos foram:");
        i = 0;  
        while (i < 5) {
            System.out.println(nomes[i]);
            i++;  
        }

        scanner.close();
    }
}