/******************************************************************************

35) Faça um programa que leia o nome e o valor de 10 produtos, calcule o valor total da compra e após escolha a forma de pagamento:
 
 1 - À Vista em Dinheiro ou Pix, recebe 8% de desconto.

 2 - À Vista no cartão de crédito, recebe 3% de desconto.

 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros.

 4 - Parcelado no cartão em três vezes ou até 10 parcelas, preço normal do produto mais juros de 10%.

 * Montar um menu com os itens acima para o usuário escolher a forma de pagamento e mostrar a lista dos produtos comprados e o valor a ser pago.


*******************************************************************************/
import java.util.Scanner;

public class _35 {
    
    public static void exibirProdutos(String[] nomes, double[] precos) {
        System.out.println("\nProdutos Comprados:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + nomes[i] + " - R$" + String.format("%.2f", precos[i]));
        }
    }

    public static double calcularValorTotal(double[] precos) {
        double total = 0;
        for (int i = 0; i < 10; i++) {
            total += precos[i];
        }
        return total;
    }

    public static double aplicarDesconto(double valorTotal, int formaPagamento) {
        if (formaPagamento == 1) { // À Vista em Dinheiro ou Pix
            valorTotal -= valorTotal * 0.08;  // 8% de desconto
            System.out.println("Desconto de 8% aplicado (À Vista em Dinheiro ou Pix)");
        } else if (formaPagamento == 2) { // À Vista no Cartão de Crédito
            valorTotal -= valorTotal * 0.03;  // 3% de desconto
            System.out.println("Desconto de 3% aplicado (À Vista no Cartão de Crédito)");
        } else if (formaPagamento == 3) { // Parcelado em 2x no Cartão de Crédito
            System.out.println("Parcelado em 2x no Cartão de Crédito - Sem juros");
        } else if (formaPagamento == 4) { // Parcelado em 3 ou mais vezes no Cartão de Crédito
            valorTotal += valorTotal * 0.10;  // 10% de juros
            System.out.println("Juros de 10% aplicados (Parcelado em 3 ou mais vezes no Cartão de Crédito)");
        }
        return valorTotal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];
        double[] precos = new double[10];

        // Lê o nome e o valor de 10 produtos
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Digite o valor do produto " + (i + 1) + ": R$ ");
            precos[i] = scanner.nextDouble();
            scanner.nextLine(); // Consome a nova linha
        }

        // Calcula o valor total da compra
        double valorTotal = calcularValorTotal(precos);
        System.out.println("\nValor total da compra (sem desconto ou juros): R$" + String.format("%.2f", valorTotal));

        int formaPagamento;
        
        // Exibe as opções de pagamento e garante que o usuário escolhe uma opção válida
        do {
            System.out.println("\nEscolha a forma de pagamento:");
            System.out.println("1 - À Vista em Dinheiro ou Pix (8% de desconto)");
            System.out.println("2 - À Vista no Cartão de Crédito (3% de desconto)");
            System.out.println("3 - Parcelado em 2x no Cartão (sem juros)");
            System.out.println("4 - Parcelado em 3 ou mais vezes no Cartão (10% de juros)");

            System.out.print("\nDigite o número da opção escolhida: ");
            formaPagamento = scanner.nextInt();

            // Verifica se a opção é válida
            if (formaPagamento < 1 || formaPagamento > 4) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (formaPagamento < 1 || formaPagamento > 4);

        // Aplica o desconto ou juros de acordo com a forma de pagamento
        double valorFinal = aplicarDesconto(valorTotal, formaPagamento);

        // Exibe os produtos e o valor final a ser pago
        exibirProdutos(nomes, precos);
        System.out.println("Valor final a ser pago: R$" + String.format("%.2f", valorFinal));

        scanner.close();
    }
}
