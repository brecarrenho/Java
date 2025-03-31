/******************************************************************************

Atividade tabuada

*******************************************************************************/
import java.util.Scanner;
public class Tabuada
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
    int n;
	    
	    System.out.print("Digite um número:  ");
	    n = ler.nextInt();
	    
	    System.out.println("Tabuada do " + n + ":");
	    for(int i=0; i<=10; i++)
	    System.out.println(n + "x" + i + "=" + (n * i));
	    
	    
	    
	}
}
