public class ContagemDeParesEImpares {

    public static void main(String[] args) {
        // Contagem de números pares e ímpares
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int pares = 0;
        int impares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    
    }
}
