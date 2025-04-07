/******************************************************************************
33.  Faça um programa que leia 10 números e informe a soma e a média dos números.

*******************************************************************************/
import java.util.Scanner;
public class _33
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int soma = 0;
	int i = 1;
	
	while(i<=10) {
	    System.out.println("Digite o " + i +"º número: ");
	    int numero = scanner.nextInt();
	    
	    soma =+ numero;
	    i++;
	    
	}
	
	double media = soma / 10.0;
	
	System.out.println("A soma dos números é: "+ soma);
	System.out.println("A média dos números é: "+ media);
	
	
	
	
	
	}
}
