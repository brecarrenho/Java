/********************************************************************************

20) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100, quantos estão entre 101 e 200 e quantos são maiores de 200.

*******************************************************************************/
import java.util.Scanner;

public class Ex_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mai = 0;
        int maio = 0;
        int maiores = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite um número " + i + ": ");
            int num = scanner.nextInt();

            if (num >= 0 && num <= 100) {
                mai++;
            } else if (num >= 101 && num <= 200){
                maio++;
            } else if (num > 200){
                maiores++;
            }
        }


        System.out.println("\nNúmeros entre 0 e 100: " + mai);
        System.out.println("Números entre 101 e 200: " + maio);
        System.out.println("Números maiores que 200: " + maiores);

        scanner.close();
    }
}