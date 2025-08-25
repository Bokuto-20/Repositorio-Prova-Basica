public class PrencherEImprimirMatriz {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3]; // Cria uma matriz 3x3

        // Preenche a matriz com valores de 1 a 9
        int valor = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor++;
            }
        }

        // Imprime a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }
    }
}
