/******************************************************************************


43 - Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.

*******************************************************************************/
import java.util.Scanner;
public class _43
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	  double salarioi, salarioa, salariof;
	  
	  System.out.print("Digite o salário: ");
	  salarioi = ler.nextDouble();
	  
	  salarioa = salarioi + (salarioi * 0.15);
	  
	  salariof = salarioa - (salarioa * 0.08);
	  
	
	System.out.println("O salário inicia é: "+salarioi);
	System.out.println("O salário com aumento é: "+salarioa);
	System.out.println("O salário final é: "+salariof);
	
	    
	    
	    
	}
	
	
}
