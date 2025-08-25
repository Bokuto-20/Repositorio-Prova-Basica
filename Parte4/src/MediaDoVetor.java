public class MediaDoVetor {

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50}; // Vetor de números
        int soma = 0; // Variável para armazenar a soma dos elementos
        double media; // Variável para armazenar a média

        // Percorre o vetor para calcular a soma dos elementos
        for (int numero : numeros) {
            soma += numero; // Adiciona o número atual à soma
        }

        // Calcula a média
        media = (double) soma / numeros.length; // Converte soma para double para evitar divisão inteira

        System.out.println("A média dos elementos do vetor é: " + media); // Exibe a média calculada
    }
}
