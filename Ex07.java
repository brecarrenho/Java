/******************************************************************************

7. Tendo como entrada o total vendido por
um funcionário no mês de abril, faça um algoritmo que calcule e mostre a sua
comissão e seu salário bruto neste mês, sabendo que o seu salário base é
R$1.200,00 e sua comissão é de 10% sobre o total vendido. O funcionário só
ganhará comissão se o valor total vendido for maior que R$2.000,00.

*******************************************************************************/
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       
        double comissao, salariobase, vendido;
       
        salariobase = 1200;
       
        System.out.print("Quanto foi vendido(em R$):  ");
        vendido = scanner.nextDouble();
       
        comissao = vendido * 0.1;
       
        if (vendido >= 2000) {
           System.out.print("Sua comissão foi de:  " + comissao);
        } else {
            System.out.print("A venda foi insuficiente para a comissão");
        }
       
        scanner.close();
    }
}