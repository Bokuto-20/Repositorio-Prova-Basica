public class NumerosPrimos {

    public static void main(String[] args) {
        // Encontrar números primos até um limite especificado
        int limite = 100; 

        System.out.println("Números primos até " + limite + ":");
        for (int num = 2; num <= limite; num++) {
            if (isPrimo(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); 
    }

    private static boolean isPrimo(int numero) {
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
