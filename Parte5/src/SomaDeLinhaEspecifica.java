public class SomaDeLinhaEspecifica {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int linha = 1; // Linha que queremos somar (0-indexed)
        int soma = 0;

        for (int j = 0; j < matriz[linha].length; j++) {
            soma += matriz[linha][j];
        }

        System.out.println("A soma da linha " + linha + " é: " + soma);
    }
}
