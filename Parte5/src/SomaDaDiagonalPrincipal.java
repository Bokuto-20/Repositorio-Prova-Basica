public class SomaDaDiagonalPrincipal {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int somaDiagonal = calcularSomaDiagonalPrincipal(matriz);
        System.out.println("A soma da diagonal principal é: " + somaDiagonal);
    }

    public static int calcularSomaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }
}
