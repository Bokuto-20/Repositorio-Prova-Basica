public class VetorInvertido {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5}; // Vetor de números
        int tamanho = numeros.length; // Obtém o tamanho do vetor

        System.out.print("Vetor invertido: ");
        // Percorre o vetor de trás para frente
        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " "); // Exibe cada elemento do vetor invertido
        }
    }
}
