/******************************************************************************

 
36) Desenvolver um programa com menu para simular uma conta corrente:    
     a) Depósito bancário
     b) Saque
     c) Saldo
     d) Sair
  * A cada ação favor montar o menu novamente.


******************************************************************************/
import java.util.Scanner;

public class _36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 0.0; // Saldo inicial da conta
        int opcao;

        do {
            // Exibe o menu para o usuário
            System.out.println("\nMenu da Conta Corrente:");
            System.out.println("1 - Depósito Bancário");
            System.out.println("2 - Saque");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair");
            System.out.print("\nEscolha a opção: ");
            opcao = scanner.nextInt();
            
            switch(opcao) {
                case 1:
                    // Depósito bancário
                    System.out.print("Digite o valor do depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito de R$ " + deposito + " realizado com sucesso.");
                    } else {
                        System.out.println("Valor inválido para depósito.");
                    }
                    break;

                case 2:
                    // Saque
                    System.out.print("Digite o valor do saque: R$ ");
                    double saque = scanner.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque de R$ " + saque + " realizado com sucesso.");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente para saque.");
                    } else {
                        System.out.println("Valor inválido para saque.");
                    }
                    break;

                case 3:
                    // Mostrar saldo
                    System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
                    break;

                case 4:
                    // Sair
                    System.out.println("Saindo... Obrigado por usar nosso sistema.");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        } while (opcao != 4); // O loop continua até o usuário escolher a opção de sair
        
        scanner.close();
    }
}