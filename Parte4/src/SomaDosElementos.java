public class SomaDosElementos {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5}; // Vetor de números
        int soma = 0; // Variável para armazenar a soma dos elementos

        // Percorre o vetor para calcular a soma dos elementos
        for (int numero : numeros) {
            soma += numero; // Adiciona cada número à soma
        }

        System.out.println("A soma dos elementos do vetor é: " + soma); // Exibe a soma total
    }
}
