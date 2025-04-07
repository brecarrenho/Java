/******************************************************************************

29. Escreva um programa que pergunte ao usuário quantos alunos ele
tem em sua academia. Em seguida, através de um laço while, o usuário
digita o peso de todos os alunos, um por vez, e por fim, o programa deve
mostrar a média de peso dos clientes.

*******************************************************************************/
import java.util.Scanner;
public class Ex_28
{
    public static void main(String[] args) {
   
    Scanner ler = new Scanner(System.in);
    int i, alunos;
    double media, altura, alturas;
    System.out.print("Quantos alunos você tem?  ");
    alunos = ler.nextInt();
   
    i = 0;
    alturas = 0;
   
    while (i < alunos){
        i++;
        altura = 0;
        System.out.println("Qual á altura do aluno  " + i + "  em métros?  ");
        altura = ler.nextDouble();
       
        alturas += altura;

    }
   
    media = alturas / alunos;
   
    System.out.println("Á média de altura da sua classe é de: " + media + " em métros");

   

    }
}