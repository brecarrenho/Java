/******************************************************************************

Sistema Bancário Simples:
Desenvolver um sistema bancário básico que permita criar contas para múltiplos usuários, realizar depósitos,
saques e consultar saldos, utilizando apenas arrays e estruturas de controle fundamentais do Java.

*******************************************************************************/
import java.util.Scanner;

public class sistema_bancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] saldos = new double[5];
        int[] contas = new int[5];

        int totalUsuarios = 0;
        int proximoNumeroConta = 100;

        boolean executando = true;

        while (executando) {
            System.out.println("\n**** Menu Bancário ****");
            System.out.println("1. Criar nova conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    if (totalUsuarios >= nomes.length) {
                        System.out.println("Limite de contas atingido");
                        break;
                    }

                    System.out.print("Digite o nome do usuário: ");
                    String nome = scanner.nextLine();

                    nomes[totalUsuarios] = nome;
                    contas[totalUsuarios] = proximoNumeroConta;
                    saldos[totalUsuarios] = 0.0;

                    System.out.println("Conta criada com sucesso!");
                    System.out.println("Nome: " + nome);
                    System.out.println("Número da conta: " + proximoNumeroConta);

                    totalUsuarios++;
                    proximoNumeroConta++;
                    break;

                case 2:
                    System.out.print("Digite o número da conta: ");
                    int contaDeposito = scanner.nextInt();
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();

                    boolean contaEncontrada = false;
                    for (int i = 0; i < totalUsuarios; i++) {
                        if (contas[i] == contaDeposito) {
                            saldos[i] += valorDeposito;
                            System.out.println("Depósito realizado com sucesso!!");
                            contaEncontrada = true;
                            break;
                        }
                    }

                    if (!contaEncontrada) {
                        System.out.println("Conta não encontrada");
                    }
                    break;

                case 3:
                    System.out.print("Digite o número da conta: ");
                    int contaSaque = scanner.nextInt();
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();

                    contaEncontrada = false;
                    for (int i = 0; i < totalUsuarios; i++) {
                        if (contas[i] == contaSaque) {
                            if (saldos[i] >= valorSaque) {
                                saldos[i] -= valorSaque;
                                System.out.println("Saque realizado com sucesso!!");
                            } else {
                                System.out.println("Saldo insuficiente");
                            }
                            contaEncontrada = true;
                            break;
                        }
                    }

                    if (!contaEncontrada) {
                        System.out.println("Conta não encontrada");
                    }
                    break;

                case 4:
                    System.out.print("Digite o número da conta: ");
                    int contaConsulta = scanner.nextInt();

                    contaEncontrada = false;
                    for (int i = 0; i < totalUsuarios; i++) {
                        if (contas[i] == contaConsulta) {
                            System.out.println("Titular: " + nomes[i]);
                            System.out.println("Saldo: R$" + saldos[i]);
                            contaEncontrada = true;
                            break;
                        }
                    }

                    if (!contaEncontrada) {
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                case 5:
                    executando = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
        