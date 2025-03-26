/******************************************************************************

6. Faça um algoritmo que receba um número
inteiro qualquer e mostre se ele é par ou impar.

*******************************************************************************/
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       
        int n1, result;
       
        System.out.print("Diga um número:  ");
        n1 = scanner.nextInt();

        result = n1 % 2;

        if (result == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

        scanner.close();
    }
}