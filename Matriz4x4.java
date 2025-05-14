/******************************************************************************

1) Desenvolver um programa que leia uma matriz 4 X 4
   a) Verificar o número de linhas e colunas
   b) Mostrar a matriz  formatada


*******************************************************************************/
import java.util.Scanner;

public class Matriz4x4 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        int numLinhas = matriz.length;
        int numColunas = matriz[0].length;

        System.out.println("\nNúmero de linhas: " + numLinhas);
        System.out.println("Número de colunas: " + numColunas);

        System.out.println("\nMatriz 4x4:");
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

    }
}