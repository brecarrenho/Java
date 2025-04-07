/******************************************************************************

32. Faça um programa que leia 5 números e informe o maior número.

*******************************************************************************/
import java.util.Scanner;
public class _32
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		int maiorNumero = Integer.MIN_VALUE;
		
		while(i<=5) {
		System.out.print("Digite o " + i + " ºnúmero: ");
		int numero = scanner.nextInt();
		
		if(numero > maiorNumero) {
		    maiorNumero = numero;
		    
		}
		
		i++;
		
		}
		System.out.println("O maior número digitado é: " + maiorNumero);
		
	}
}
