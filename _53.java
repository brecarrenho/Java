/******************************************************************************

53.Faça um programa que leia 10 valores reais e os apresente na ordem:
       a) crescente
       b) decrescente
       c) inversa da entrada.
       * pesquisar para obter os valores em ordem crescente e decrescente.
*******************************************************************************/
import java.util.Arrays;
import java.util.Collections;
public class _53
{
	public static void main(String[] args) {
		double [] numeros = new double[10];
		
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		numeros[5] = 60;
		numeros[6] = 70;
		numeros[7] = 80;
		numeros[8] = 90;
		numeros[9] = 100;
		
		//Ordem crescente
		Double[] crescente = new Double [numeros.length];
		for (int i=0; i<numeros.length; i++) {
		    crescente[i] = numeros[i];
		}
		Arrays.sort(crescente);
		System.out.println("Ordem crescente: ");
		for (double num : crescente) {
		    System.out.print(num + " ");
		}
		
		//Ordem decrescente
        Double[] decrescente = new Double[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            decrescente[i] = numeros[i];
        }
		
		Arrays.sort(decrescente, Collections.reverseOrder());
		System.out.println("\nOrdem decrescente: ");
		for (double num : decrescente) {
		    System.out.print(num + " ");
		}
		
		//Ordem inversa de entrada
		System.out.println("\nOrdem inversa de entrada: ");
		for (int i = numeros.length - 1; i >= 0; i--) {
		    System.out.print(numeros[i] + " ");
		}
		
		
	
	}
}
