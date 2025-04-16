/******************************************************************************

54.Faça um programa para ler N valores inteiros e armazená-los em um Array. O
programa deve contar quantos valores pares ele possui e multiplicar os valores ímpares.


*******************************************************************************/
import java.util.Scanner;

public class _54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lendo o número de elementos que o usuário vai inserir
        System.out.print("Digite a quantidade de valores: ");
        int N = scanner.nextInt();
        
        int[] numeros = new int[N];
        
        int contPares = 0;
        int produtoImpares = 1;
        boolean encontrouImpar = false;  // Variável para verificar se encontramos pelo menos um ímpar
        
        // Lendo os N valores inteiros
        System.out.println("Digite " + N + " números inteiros:");
        for (int i = 0; i < N; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            
            // Verificando se o número é par
            if (numeros[i] % 2 == 0) {
                contPares++;
            } else {
                // Se for ímpar, multiplicamos os valores ímpares
                produtoImpares *= numeros[i];
                encontrouImpar = true;  // Indicamos que encontramos pelo menos um ímpar
            }
        }
        
        // Exibindo os resultados
        System.out.println("Quantidade de números pares: " + contPares);
        
        if (encontrouImpar) {
            System.out.println("Produto dos números ímpares: " + produtoImpares);
        } else {
            System.out.println("Não houve números ímpares para multiplicar.");
        }

  
    }
}