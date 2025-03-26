/******************************************************************************

11 -  Um banco concederá um crédito especial aos seus clientes, variável com o saldo médio no último ano. Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela abaixo. Mostre uma mensagem informando o saldo médio e o valor do crédito.
de 0 a 200 - nenhum crédito
de 201 a 400 - 20% do valor do saldo médio
de 401 a 600 - 30% do valor do saldo médio
acima de 601 - 40% do valor do saldo médio

*******************************************************************************/
import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo médio do cliente
        System.out.print("Informe o saldo médio do cliente: ");
        double saldoMedio = scanner.nextDouble();

        // Variável para armazenar o valor do crédito
        double credito = 0.0;

        // Calcula o valor do crédito com base no saldo médio
        if (saldoMedio >= 0 && saldoMedio <= 200) {
            credito = 0.0; // Nenhum crédito
        } else if (saldoMedio >= 201 && saldoMedio <= 400) {
            credito = saldoMedio * 0.20; // 20% do valor do saldo médio
        } else if (saldoMedio >= 401 && saldoMedio <= 600) {
            credito = saldoMedio * 0.30; // 30% do valor do saldo médio
        } else if (saldoMedio > 600) {
            credito = saldoMedio * 0.40; // 40% do valor do saldo médio
        } else {
            System.out.println("Saldo médio inválido.");
        }

        // Exibe o saldo médio e o valor do crédito
        System.out.printf("Saldo médio: R$ %.2f\n", saldoMedio);
        System.out.printf("Valor do crédito concedido: R$ %.2f\n", credito);

        // Fecha o scanner
        scanner.close();
    }
}