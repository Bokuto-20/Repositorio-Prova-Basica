import java.util.Scanner;

public class LerEImprimirVetor {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int[] numeros = new int[5];

        // Leitura dos números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = tec.nextInt();
        }

        // Impressão dos números
        System.out.println("Números digitados:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
       
    }
}
