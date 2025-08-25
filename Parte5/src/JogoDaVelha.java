import java.util.Scanner;

public class JogoDaVelha {

    private static char[][] tabuleiro = new char[3][3];
    private static char jogadorAtual;

    public static void main(String[] args) {
        inicializarTabuleiro();
        jogadorAtual = 'X';
        boolean jogoTerminou = false;

        Scanner tec = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo da Velha!");

        while (!jogoTerminou) {
            exibirTabuleiro();
            System.out.println("Jogador " + jogadorAtual + ", faça sua jogada (linha e coluna, de 0 a 2):");
            int linha = tec.nextInt();
            int coluna = tec.nextInt();

            if (fazerJogada(linha, coluna)) {
                if (verificarVitoria()) {
                    System.out.println("Jogador " + jogadorAtual + " venceu!");
                    jogoTerminou = true;
                } else if (verificarEmpate()) {
                    System.out.println("O jogo terminou em empate!");
                    jogoTerminou = true;
                } else {
                    alternarJogador();
                }
            } else {
                System.out.println("Jogada inválida. Tente novamente.");
            }
        }
        exibirTabuleiro();
    }

    private static void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    private static void exibirTabuleiro() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static boolean fazerJogada(int linha, int coluna) {
        if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
            tabuleiro[linha][coluna] = jogadorAtual;
            return true;
        }
        return false;
    }

    private static boolean verificarVitoria() {
        // Verificar linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) return true;
            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) return true;
        }
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) return true;
        if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) return true;
        return false;
    }

    private static boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void alternarJogador() {
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }
}