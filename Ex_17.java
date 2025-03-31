/******************************************************************************
17) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.

*******************************************************************************/
import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma = 0;
        int numero;

       
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = ler.nextInt(); 
            soma += numero; 
        }

      
        System.out.println("A soma dos números é: " + soma);
    }
}