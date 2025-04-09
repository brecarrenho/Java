/******************************************************************************
37 - Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras.
*******************************************************************************/
import java.util.Scanner;

public class _37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de cavalos no haras: ");
        int cavalos = scanner.nextInt();

        int ferradurasnecessarias = cavalos * 4;

        System.out.println("São necessárias " + ferradurasnecessarias + " ferraduras.");
       
        scanner.close();
    }
}