public class MaiorEMenor {

    public static void main(String[] args) {
        int[] numeros = {3, 5, 7, 2, 8, 6, 4}; // Vetor de números
        int maior = numeros[0]; // Inicializa o maior elemento com o primeiro elemento do vetor
        int menor = numeros[0]; // Inicializa o menor elemento com o primeiro elemento do vetor

        // Percorre o vetor para encontrar o maior e o menor elemento
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero; // Atualiza o maior elemento se encontrar um número maior
            }
            if (numero < menor) {
                menor = numero; // Atualiza o menor elemento se encontrar um número menor
            }
        }

        System.out.println("O maior elemento do vetor é: " + maior); // Exibe o maior elemento encontrado
        System.out.println("O menor elemento do vetor é: " + menor); // Exibe o menor elemento encontrado
    }
}
