/******************************************************************************

41 - O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo
que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a
balança já desconte o peso do prato.  


*******************************************************************************/
import java.util.Scanner;
public class _41
{
	public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double peso, multiplicacao;
    
    System.out.print("Digite o peso do seu prato já montado(KG): ");
    peso = ler.nextDouble();

    multiplicacao = peso * 12;
    
    System.out.println("O preço do seu prato será: " +multiplicacao);
    
     
    }
}
