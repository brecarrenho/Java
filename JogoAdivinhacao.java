/******************************************************************************

2 - Jogo de adivinhação com dificuldade
Crie um jogo de adivinhação onde o jogador escolhe a dificuldade (fácil: 1 a 10, médio: 1 a 50, difícil: 1 a 100). 
O programa gera um número aleatório(pesquisar)
e o jogador tem 5 tentativas para acertar. A cada erro, o programa dá dicas: "maior" ou "menor".

*******************************************************************************/
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Escolha a dificuldade: 1 - Fácil (1-10), 2 - Médio (1-50), 3 - Difícil (1-100)");
        int dificuldade = sc.nextInt();
        int max = 10;

        if (dificuldade == 2) max = 50;
        else if (dificuldade == 3) max = 100;

        int numero = rand.nextInt(max) + 1;
        int tentativas = 5;

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            int palpite = sc.nextInt();

            if (palpite == numero) {
                System.out.println("Parabéns! Você acertou!");
                return;
            } else if (palpite < numero) {
                System.out.println("Tente um número MAIOR.");
            } else {
                System.out.println("Tente um número MENOR.");
            }
        }

        System.out.println("Você perdeu! O número era: " + numero);
        sc.close();
    }
}