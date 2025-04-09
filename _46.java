/******************************************************************************

46 - Desenvolver um programa com  Ao iniciar o programa, exiba o seguinte menu de opções:

--- Calculadora de Áreas ---
1. Calcular Área do Retângulo
2. Calcular Área do Triângulo
3. Calcular Área do Círculo
0. Sair
-- Escolha uma opção:

*******************************************************************************/
import java.util.Scanner;

public class _46 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double saldo = 0.0;
        int opcao;


        do {

            System.out.println("\n--- Calculadora de Áreas --- ");
            System.out.println("1. Calcular Área do Retângulo ");
            System.out.println("2. Calcular Área do Triângulo ");
            System.out.println("3. Calcular Área do Círculo ");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:

                    System.out.print("Digite o valor da altura: ");
                    double altura = ler.nextDouble();
                    System.out.println("Digite o valor da base: ");
                    double base = ler.nextDouble();
                   
                    double area = altura * base;
                   
                    System.out.println("A área será: " + area);
                    break;
               
                case 2:
                   
                    System.out.print("Digite o valor da altura: ");
                    altura = ler.nextDouble();
                    System.out.println("Digite o valor da base: ");
                    base = ler.nextDouble();
                   
                    area = altura * base / 2;
                   
                    System.out.println("A área será: " + area);
                    break;
               
                case 3:

                    System.out.print("Digite o raio do circulo: ");
                    double raio = ler.nextDouble();

                   
                    area = 3.14 * (raio * raio);
                   
                    System.out.println("A área será: " + area);
                    break;
               
                case 4:

                    System.out.println("Saindo... Até logo!");
                    break;
               
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        ler.close();
    }
}