/******************************************************************************

28. Faça um programa, utilizando while, que permita o usuário fazer contas de adição enquanto quiser.

*******************************************************************************/
import java.util.Scanner;
public class Ex_28
{
    public static void main(String[] args) {
   
    Scanner ler = new Scanner(System.in);
    int soma, n1, n2;
    char option;
    System.out.print("Você quer fazer uma soma?(y para sim, n para não) ");
    option = ler.next().charAt(0);
   
    if(option == 'y'){
        while(option == 'y'){
        soma = 0;
        System.out.println("Diga o primeiro número");
        n1 = ler.nextInt();
        System.out.println("Diga o segundo número");
        n2 = ler.nextInt();
       
        soma = n1 + n2;
       
        System.out.println("Está é a soma:  " + soma);
        System.out.println("Deseja continuar com outra soma (y para sim, n para não):  ");
        option = ler.next().charAt(0);
        }
    } else if(option == 'n'){
        System.out.println("Programa finalizado.");
    } else {
            System.out.println("Opção inválida, por favor digite 'y' para sim ou 'n' para não.");
        }
   

    }
}