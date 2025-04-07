/******************************************************************************
26. Faça um programa, utilizando while, que mostre na tela de 0 até N, em que N é o limite inserido pelo usuário.
*******************************************************************************/
import java.util.Scanner;
public class Ex_26
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
       
        System.out.println("Insira o limite: ");
         int limite = scanner.nextInt();
       
        while(i <= limite){
            System.out.println("O valor de i é: " + i);
            i++;
           
            scanner.close();
        }
    }
}