/******************************************************************************
38 -  A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia.
Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou
com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado).
Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as
quantidades de pães e de broas, e depois calcular os dados solicitados.
*******************************************************************************/
import java.util.Scanner;

public class _38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precopao = 0.12;
        double precobroa = 1.50;

        System.out.print("Informe a quantidade de pães vendidos: ");
        int paesvendidos = scanner.nextInt();
        System.out.print("Informe a quantidade de broas vendidas: ");
        int broasvendidas = scanner.nextInt();

        double totalarrecadado = (paesvendidos * precopao) + (broasvendidas * precobroa);

        double valorpoupanca = totalarrecadado * 0.10;

        System.out.println("Total arrecadado: R$ " + totalarrecadado);
        System.out.println("Valor a ser guardado na poupança: R$ " + valorpoupanca);

        scanner.close();
    }
}