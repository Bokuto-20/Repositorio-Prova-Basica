public class ContarValorNaMatriz {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        int valorParaContar = 5;
        int contador = contarValorNaMatriz(matriz, valorParaContar);
        
        System.out.println("O valor " + valorParaContar + " aparece " + contador + " vezes na matriz.");
    }

    public static int contarValorNaMatriz(int[][] matriz, int valor) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
