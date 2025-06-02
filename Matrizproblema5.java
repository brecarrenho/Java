/******************************************************************************

5. Desenvolva um programa que leia duas matrizes 5x2 e crie uma terceira matriz também 5x2
com o valor da soma dos elementos de mesmo índice.

*******************************************************************************/

import java.util.Scanner;

public class Matrizproblema5 {
   public static void main(String[] args) {
        int[][] matriz1 = new int[5][2];
        int[][] matriz2 = new int[5][2];
        int[][] matrizSoma = new int[5][2];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da primeira matriz 5x2:");

       
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz1 [" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nDigite os elementos da segunda matriz 5x2: ");
       
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz2 [" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }
       
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 2; j++){
                matrizSoma[i][j] = matriz1 [i][j] + matriz2 [i][j];
               
            }
        }
       
        System.out.println("\nMatriz 1: ");
        System.out.println("\nMatriz 2: ");
        System.out.println("\nMatriz Soma: ");
        imprimirMatriz(matrizSoma);
   }
    public static void imprimirMatriz(int[][] matriz){
        for (int [] linha: matriz){
        for (int elemento : linha) {
            }
            System.out.print("Elemento + \t");
        }
       
    }
    }