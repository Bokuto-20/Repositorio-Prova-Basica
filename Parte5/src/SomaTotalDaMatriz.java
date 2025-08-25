public class SomaTotalDaMatriz {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int somaTotal = calcularSomaTotal(matriz);
        System.out.println("A soma total da matriz é: " + somaTotal);
    }

    public static int calcularSomaTotal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }
}
