/******************************************************************************

42 - Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a
quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
informe quanto será o valor arrecadado.

*******************************************************************************/
import java.util.Scanner;

public class _42 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        
        int precoP = 10;
        int precoM = 12; 
        int precoG = 15; 

        
        int qtdP = 0, qtdM = 0, qtdG = 0;
        int total;

        
        System.out.println("Escolha o tipo de camiseta para registrar a quantidade:");
        System.out.println("1 - Camiseta Pequena (P)");
        System.out.println("2 - Camiseta Média (M)");
        System.out.println("3 - Camiseta Grande (G)");
        System.out.println("4 - Calcular valor total");

        int escolha = ler.nextInt();

      
        switch (escolha) {
            case 1:
                System.out.print("Informe a quantidade de camisetas pequenas: ");
                qtdP = ler.nextInt();
                total = qtdP * precoP;
                System.out.print("O prço será: "+total);
                break;
            case 2:
                System.out.print("Informe a quantidade de camisetas médias: ");
                qtdM = ler.nextInt();
                total = qtdM * precoM;
                System.out.print("O prço será: "+total);
                break;
            case 3:
                System.out.print("Informe a quantidade de camisetas grandes: ");
                qtdG = ler.nextInt();
                total = qtdG * precoG;
                System.out.print("O prço será: "+total);
                break;
            case 4:
               
                total = (qtdP * precoP) + (qtdM * precoM) + (qtdG * precoG);
                System.out.println("O valor total será R$: " + total);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}