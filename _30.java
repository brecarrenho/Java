/******************************************************************************

30. Escreva um programa que pergunta um número ao usuário, e
mostre sua tabuada completa desse número (de 1 até 10).

*******************************************************************************/
import java.util.Scanner;
public class Ex_30
{
    public static void main(String[] args) {
   
    Scanner ler = new Scanner(System.in);
    int i, tabuada, resultado;

    System.out.print("Qual número você quer a tabuada?  ");
    tabuada = ler.nextInt();
   
    i = 0;

    System.out.println("Está é a determinada tabuada:");
    while (i < 10){
        i++;
        resultado = 0;
        resultado = tabuada * i;
       
        System.out.println(tabuada + " X " + i + " = " + resultado);
        }
    }
}

Adicionar comentário para a turma...