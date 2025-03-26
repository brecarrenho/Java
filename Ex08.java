/*******************************************************************************
8. Construa um algoritmo que, tendo como
dados de entrada a altura (H) e o sexo (S) de uma pessoa calcule e apresente
seu peso ideal utilizando as seguintes fórmulas: Para homens: Peso ideal (P) =
(72,7 * H) – 58 Para mulheres: Peso ideal (P) = (62,1 * H) – 44,7
*******************************************************************************/
import java.util.Scanner;
public class Ex08
{
    public static void main(String[] args) {
       
    double altura, peso;
    int genero;
   
    Scanner ler = new Scanner(System.in);
   
    System.out.println("Digite sua altura:  ");
    altura = ler.nextDouble();
   
    System.out.println("Qual o seu gernero(1 = masculino e 2 = feminino):  ");
    genero = ler.nextInt();
   
   
    if (genero == 1){
       
        peso = (72.7 * altura) - 58;
       
    System.out.println("Seu peso ideal seria:  " + peso);
    } else {
       
        peso = (62.1 * altura) - 44.7;
       
    System.out.println("Seu peso ideal seria:  " + peso);
    }  
    }
    }