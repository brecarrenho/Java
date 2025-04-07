/******************************************************************************
31. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro.
*******************************************************************************/
import java.util.Scanner;
public class _31
{
	public static void main(String[] args) {
	int i = 1;
	
	System.out.println("Números de 1 a 20, um abaixo do outro: ");
	while (i<=20) {
	    System.out.println(i);
	    i++; }
	    
	    System.out.println();
	    
	    System.out.println("Números de 1 a 20, um ao lado do outro: ");
	    i = 1;
	    while(i<=20) {
	    System.out.print(i + " ");
	    i++;  }
	    

	}

}
