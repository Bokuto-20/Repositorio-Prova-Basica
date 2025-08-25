public class MaiorValorDaMatriz {

    public static void main(String[] args) {
        int[][] matriz = {
            {3, 5, 1},
            {7, 2, 8},
            {4, 6, 9}
        };

        int maiorValor = matriz[0][0]; // Inicializa com o primeiro elemento

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }

        System.out.println("O maior valor da matriz é: " + maiorValor);
    }
}
