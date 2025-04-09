/******************************************************************************
40 -  Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
tanque.
*******************************************************************************/
import java.util.Scanner;

public class _40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o preço do litro da gasolina: R$ ");
        double precolitro = scanner.nextDouble();
        System.out.print("Informe o valor a ser pago: R$ ");
        double valorpago = scanner.nextDouble();
       
        double litroscolocados = valorpago / precolitro;

        System.out.println("Você conseguiu colocar " + litroscolocados + " litros de gasolina.");

        scanner.close();
    }
}