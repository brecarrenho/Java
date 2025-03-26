/******************************************************************************
10. Construa um algoritmo que determine
quanto será gasto para encher o tanque de um carro (VG), sabendo-se que o preço
da gasolina é de R$ 1,80 e o preço do álcool é de R$ 1,00. O usuário fornecerá
os seguintes dados: Tipo de carro (TC) (G – gasolina ou A – álcool) e
Capacidade do tanque (CT), em litros.
*******************************************************************************/
import java.util.Scanner;

public class ex10 {
   
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
       
        // Preços dos combustíveis
        double precoGasolina = 1.80;
        double precoAlcool = 1.00;
       
        // Solicita o tipo de combustível e a capacidade do tanque ao usuário
        System.out.print("Informe o tipo de combustível (G para gasolina ou A para álcool): ");
        char tipoCarro = scanner.next().charAt(0);
       
        System.out.print("Informe a capacidade do tanque em litros: ");
        double capacidadeTanque = scanner.nextDouble();
       
        // Variável para armazenar o valor a ser gasto
        double gasto = 0.0;
       
        // Calcula o gasto dependendo do tipo de combustível
        if (tipoCarro == 'G' || tipoCarro == 'g') {
            gasto = capacidadeTanque * precoGasolina;
        } else if (tipoCarro == 'A' || tipoCarro == 'a') {
            gasto = capacidadeTanque * precoAlcool;
        } else {
            System.out.println("Tipo de combustível inválido.");
        }
       
        // Exibe o resultado
        System.out.printf("O gasto para encher o tanque será: R$ %.2f\n", gasto);
       
        // Fecha o scanner
        scanner.close();
    }
}