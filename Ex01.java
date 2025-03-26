/******************************************************************************

Ex01 - Faça um algoritmo para calcular a média final da disciplina de programação, mostrar
essa média final e também uma mensagem informando se o aluno foi aprovado
(média >= 7) ou reprovado. Considere duas avaliações.
*******************************************************************************/
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        double nota1, nota2, soma, media;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        
        soma = nota1 + nota2;
        media = soma / 2; // Corrigido para dividir por 2
        
        System.out.println("Soma das notas: " + soma);
        System.out.println("A média será: " + media);
        
        if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado, estudar mais!");
        }
        
        scanner.close(); // Boa prática fechar o Scanner após o uso
    }
}