/******************************************************************************


2) Faça um programa que leia uma matriz 3x4 de inteiros, substitua seus elementos negativos por 0
e imprima a matriz original e a modificada.


*******************************************************************************/
import java.util.Scanner;

public class Matriz3x4 {

    public static void main(String[] args) {
        int[][] matrizOriginal = new int[3][4];
        int[][] matrizModificada = new int[3][4];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matrizOriginal[i][j] = scanner.nextInt();

                matrizModificada[i][j] = (matrizOriginal[i][j] < 0) ? 0 : matrizOriginal[i][j];
            }
        }

        System.out.println("\nMatriz Original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", matrizOriginal[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz Modificada (negativos substituídos por 0):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", matrizModificada[i][j]);
            }
            System.out.println();
        }
    }
}
        

    