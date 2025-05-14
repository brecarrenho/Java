/******************************************************************************



3) Faça um programa que leia uma matriz [5,5]de inteiros e verifique se existem elementos repetidos.
Mostrar a matriz e os números repetidos.

*******************************************************************************/
import java.util.*;

public class Matriz5x5 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> contagem = new HashMap<>();

        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                int valor = scanner.nextInt();
                matriz[i][j] = valor;

                contagem.put(valor, contagem.getOrDefault(valor, 0) + 1);
            }
        }

        System.out.println("\nMatriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nNúmeros repetidos:");
        boolean haRepetidos = false;
        for (Map.Entry<Integer, Integer> entrada : contagem.entrySet()) {
            if (entrada.getValue() > 1) {
                System.out.printf("Número %d aparece %d vezes\n", entrada.getKey(), entrada.getValue());
                haRepetidos = true;
            }
        }

        if (!haRepetidos) {
            System.out.println("Não há elementos repetidos.");
        }

        scanner.close();
    }
}
