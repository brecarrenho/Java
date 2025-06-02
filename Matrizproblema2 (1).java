/******************************************************************************

2. Crie um algoritmo que leia uma matriz 3x3 e calcule a soma dos valores das colunas da
matriz.
Ex:
Soma Coluna 1 = 8
Soma Coluna 2 = 5
Soma Coluna 3 = 6

*******************************************************************************/
import java.util.Scanner;

public class Matrizproblema2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Soma da Coluna " + (j + 1) + " = " + somaColuna);
        }

        scanner.close();
    }
}