/******************************************************************************

3. Faça um algoritmo que receba três
números inteiros e mostre o maior deles. Considere que os números sempre serão
diferentes.
*******************************************************************************/
import java.util.Scanner;
public class Ex03
{
	public static void main(String[] args) {
		int n1, n2, n3, soma;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		n1 = scanner.nextInt();
		
	    System.out.println("Digite o primeiro número: ");
		 n2 = scanner.nextInt();
		
		System.out.println("Digite o primeiro número: ");
		 n3 = scanner.nextInt();
		
		int maior;
		
		if (n1 > n2 && n1 > n3){
		    maior = n1;
		} else if (n2 > n1 && n2 > n3){
		    maior = n2;
		    } else{
		    maior = n3; 
		    }
		System.out.println("O número maior é: " + maior);
	     	}
		}
		
		
		