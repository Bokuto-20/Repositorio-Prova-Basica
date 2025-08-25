public class SomaComWhile {

    public static void main(String[] args) {
        // Cálculo da soma dos números de 1 a 10 usando while
        int soma = 0;
        int numero = 1;
        
        while (numero <= 10) {
            soma += numero;
            numero++;
        }
        
        System.out.println("A soma dos números de 1 a 10 é: " + soma);
    }
}
