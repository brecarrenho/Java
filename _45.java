/******************************************************************************

45 - A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de
queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou
presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em
que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em
quilos) de queijo, presunto e carne necessários para compra.

*******************************************************************************/
import java.util.Scanner;
public class _45
{
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
       
        double kilosq, kilosp, kilosr, queijo, presunto, hamburger;
        int hamburgers;
       
        System.out.println("Quantos hamburgers serão feitos:  ");
        hamburgers = ler.nextInt();
       
        queijo = hamburgers * 2;
        presunto = hamburgers;
        hamburger = hamburgers;
       
        kilosq = 0.05 * queijo;
        kilosp = 0.05 * presunto;
        kilosr = 0.1 * hamburger;
       
        System.out.println("Nós presisaremos de:");
        System.out.println(kilosq + " quilos de quijo/n")    ;    
        System.out.println(kilosp + " quilos de presunto/n");
        System.out.println(kilosr + " quilos de hamburger/n");
    }
}