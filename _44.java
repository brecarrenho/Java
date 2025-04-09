/******************************************************************************

44 - Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar. Faça um
algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que
Carlos e André não paguem centavos. Ex: uma conta de R$101,53 resulta em R$33,00 para
Carlos, R$33,00 para André e R$35,53 para Felipe.

*******************************************************************************/
import java.util.Scanner;
public class _44
{
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
       
        int reais, total, cent;
       
        System.out.println("Qual o total a pagar (em R$):  ");
        reais = ler.nextInt();
        System.out.println("Qual o valor em centavos a pagar:  ");
        cent = ler.nextInt();
       
        total = reais / 3;
       
        System.out.println("O valor que Carlos deve pagar é:  " + total);
        System.out.println("O valor que André deve pagar é:  " + total);
        System.out.println("O valor que Felipe deve pagar é:  " + total + "," + cent);
       
    }
}