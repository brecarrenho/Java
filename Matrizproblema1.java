/******************************************************************************

1. Crie um programa que leia uma matriz 5x5. Em seguida, conte quantos números pares
existem na matriz.

*******************************************************************************/
import java.util.Scanner;
public class Matrizproblema1 {
    public static void main(String[] args){
        Scanner limao = new Scanner(System.in);

        int[][] matriz = new int [6][6];

        int coluna = 0;
        int pares = 0;
        
        for(int i = 0; i < 5; i++){
            
            System.out.println("Escreva o número para: " + i + " " + coluna);
            matriz[coluna][i] = limao.nextInt();
            if(matriz[coluna][i] % 2 == 0){
                pares++;
            }
            if(i == 4){
                if(coluna < 5){
                    coluna++;
                    i = 0;
                }
            }
        }
        System.out.println("Está é a matriz:");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println("Tendo " + pares + " números pares no total");
    }
}
