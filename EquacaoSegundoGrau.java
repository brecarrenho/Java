/******************************************************************************

6 - Faça um programa em Java para resolver a equação de 2º grau.        
        Pedir para o usuário entrar com as variáveis A, B e C .
        Mostrar o valor de x1, x2 e delta.
       

*******************************************************************************/
import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Não é uma equação de 2º grau.");
        } else if (delta < 0) {
            System.out.println("Delta = " + delta + " (sem raízes reais)");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Delta = " + delta);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        sc.close();
    }
}