public class MaiorElementoDoVetor {

    public static void main(String[] args) {
        int[] numeros = {3, 5, 7, 2, 8, 6, 4}; // Vetor de números
        int maior = numeros[0]; // Inicializa o maior elemento com o primeiro elemento do vetor

        // Percorre o vetor para encontrar o maior elemento
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero; // Atualiza o maior elemento se encontrar um número maior
            }
        }

        System.out.println("O maior elemento do vetor é: " + maior); // Exibe o maior elemento encontrado
    }
}
