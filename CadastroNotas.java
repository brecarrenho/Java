/******************************************************************************


3 - Cadastro de notas com classificação
O programa deve permitir o cadastro de várias notas (entre 0 e 10). A cada nota inserida, o sistema deve classificar como:

*******************************************************************************/
import java.util.Scanner;

public class CadastroNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int excelente = 0, bom = 0, regular = 0, insuficiente = 0;
        double soma = 0;
        int count = 0;

        while (true) {
            System.out.print("Digite a nota (-1 para sair): ");
            double nota = sc.nextDouble();
            if (nota == -1) break;

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida!");
                continue;
            }

            soma += nota;
            count++;

            if (nota >= 9) excelente++;
            else if (nota >= 7) bom++;
            else if (nota >= 5) regular++;
            else insuficiente++;
        }

        double media = count > 0 ? soma / count : 0;

        System.out.println("\nMédia geral: " + media);
        System.out.println("Excelente: " + excelente);
        System.out.println("Bom: " + bom);
        System.out.println("Regular: " + regular);
        System.out.println("Insuficiente: " + insuficiente);

        sc.close();
    }
}