public class MaiorEmenor {

    public static void main(String[] args) {
        // Encontrar o maior e o menor número em um array
        int[] numeros = {3, 5, 7, 2, 8, 1, 4, 6};
        int maior = numeros[0];
        int menor = numeros[0];
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
    
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
