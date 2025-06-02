import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Campo[][] velha = new Campo[3][3];
        char simboloAtual = 'X';
        boolean game = true;
        String vitoria = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o nome do primeiro jogador (X): ");
        String nomex = scan.nextLine();
        System.out.print("Informe o nome do segundo jogador (O): ");
        String nomeo = scan.nextLine();

        iniciarJogo(velha);

        while (game) {
            desenhaJogo(velha);
            vitoria = verificarVitoria(velha);
            if (!vitoria.equals("")) {
                desenhaJogo(velha);
                if (vitoria.equals("X")) {
                    System.out.printf("Jogador %s venceu!%n", nomex);
                } else {
                    System.out.printf("Jogador %s venceu!%n", nomeo);
                }
                break;
            }

            if (verificarEmpate(velha)) {
                desenhaJogo(velha);
                System.out.println("Deu velha! Empate.");
                break;
            }

            try {
                if (verificarJogada(velha, jogar(scan, simboloAtual), simboloAtual)) {
                    simboloAtual = (simboloAtual == 'X') ? 'O' : 'X';
                } else {
                    System.out.println("Posição já ocupada. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro: entrada inválida.");
                scan.nextLine(); // Limpa buffer do scanner
            }
        }

        System.out.println("Fim de Jogo");
    }

    public static void desenhaJogo(Campo[][] velha) {
        limparTela();
        System.out.println("    0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d   %c | %c | %c %n", i,
                    velha[i][0].getSimbolo(), velha[i][1].getSimbolo(), velha[i][2].getSimbolo());
            if (i < 2) {
                System.out.println("   -----------");
            }
        }
    }

    public static void limparTela() {
        for (int cont = 0; cont < 50; cont++) {
            System.out.println();
        }
    }

    public static int[] jogar(Scanner scan, char simboloAtual) {
        int[] p = new int[2];
        System.out.printf("Quem joga: %c%n", simboloAtual);
        System.out.print("Informe a linha (0-2): ");
        p[0] = scan.nextInt();
        System.out.print("Informe a coluna (0-2): ");
        p[1] = scan.nextInt();
        return p;
    }

    public static boolean verificarJogada(Campo[][] velha, int[] p, char simboloAtual) {
        if (p[0] < 0 || p[0] > 2 || p[1] < 0 || p[1] > 2) return false;
        if (velha[p[0]][p[1]].getSimbolo() == ' ') {
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        }
        return false;
    }

    public static void iniciarJogo(Campo[][] velha) {
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                velha[l][c] = new Campo();
            }
        }
    }

    public static String verificarVitoria(Campo[][] velha) {
        for (int i = 0; i < 3; i++) {
            // Verifica linhas
            if (velha[i][0].getSimbolo() != ' ' &&
                velha[i][0].getSimbolo() == velha[i][1].getSimbolo() &&
                velha[i][1].getSimbolo() == velha[i][2].getSimbolo()) {
                return String.valueOf(velha[i][0].getSimbolo());
            }
            // Verifica colunas
            if (velha[0][i].getSimbolo() != ' ' &&
                velha[0][i].getSimbolo() == velha[1][i].getSimbolo() &&
                velha[1][i].getSimbolo() == velha[2][i].getSimbolo()) {
                return String.valueOf(velha[0][i].getSimbolo());
            }
        }

        // Verifica diagonais
        if (velha[0][0].getSimbolo() != ' ' &&
            velha[0][0].getSimbolo() == velha[1][1].getSimbolo() &&
            velha[1][1].getSimbolo() == velha[2][2].getSimbolo()) {
            return String.valueOf(velha[0][0].getSimbolo());
        }

        if (velha[0][2].getSimbolo() != ' ' &&
            velha[0][2].getSimbolo() == velha[1][1].getSimbolo() &&
            velha[1][1].getSimbolo() == velha[2][0].getSimbolo()) {
            return String.valueOf(velha[0][2].getSimbolo());
        }

        return "";
    }

    // Novo método para verificar empate
    public static boolean verificarEmpate(Campo[][] velha) {
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                if (velha[l][c].getSimbolo() == ' ') {
                    return false; // Ainda tem espaço vazio, não é empate
                }
            }
        }
        // Se não tem espaço vazio e ninguém venceu, é empate
        return verificarVitoria(velha).equals("");
    }
}
