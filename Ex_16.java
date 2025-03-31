/******************************************************************************

16) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
*******************************************************************************/
import java.util.Scanner;
public class Ex_16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
   
        System.out.print("Informe o seu nome: ");
        nome = ler.nextLine();
        
        for(int i = 1; i <= 10; i++) {
        System.out.println("Nome: " + nome);
        }
    }
}