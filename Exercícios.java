
        /******************************************************************************
1.  
Escreva um programa que exiba os números pares de 1 a 50 e os números
ímpares de 51 a 100 utilizando um laço de repetição.
Utilize while.

*******************************************************************************/
import java.util.Scanner;

public class Exercícios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Pares de 1 a 50:");
        int i = 1;
        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println("\nÍmpares de 51 a 100:");
        i = 51;
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

// 2. Pares de 1 a 50, ímpares de 51 a 100 (for)
        System.out.println("\n\n2. Pares de 1 a 50:");
        for (i = 1; i <= 50; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println("\nÍmpares de 51 a 100:");
        for (i = 51; i <= 100; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }

        // 3. Tabuada com while
        System.out.print("\n\n3. Digite um número para a tabuada (while): ");
        int num = scanner.nextInt();
        i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }

        // 4. Tabuada com for
        System.out.print("\n4. Digite um número para a tabuada (for): ");
        num = scanner.nextInt();
        for (i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        // 5. Soma dos pares com while
        int soma = 0;
        i = 1;
        while (i <= 100) {
            if (i % 2 == 0) soma += i;
            i++;
        }
        System.out.println("\n5. Soma dos pares de 1 a 100 (while): " + soma);

        // 6. Soma dos pares com for
        soma = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) soma += i;
        }
        System.out.println("6. Soma dos pares de 1 a 100 (for): " + soma);

        // 7. Potência com laço
        System.out.print("\n7. Digite a base: ");
        int base = scanner.nextInt();
        System.out.print("Digite o expoente: ");
        int exp = scanner.nextInt();
        int resultado = 1;
        for (i = 1; i <= exp; i++) {
            resultado *= base;
        }
        System.out.println("Resultado: " + resultado);

        // 8. Soma e média de 5 idades
        soma = 0;
        for (i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            soma += idade;
        }
        double media = soma / 5.0;
        System.out.println("Soma das idades: " + soma);
        System.out.println("Média das idades: " + media);

        // 9. Contar maiores que 10
        int cont = 0;
        for (i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = scanner.nextInt();
            if (num > 10) cont++;
        }
        System.out.println("Quantidade de números maiores que 10: " + cont);

        // 10. Números entre 0 e 100
        cont = 0;
        for (i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = scanner.nextInt();
            if (num >= 0 && num <= 100) cont++;
        }
        System.out.println("Quantidade de números entre 0 e 100: " + cont);

        scanner.close();
    }
}

