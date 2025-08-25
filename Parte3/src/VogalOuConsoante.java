import java.util.Scanner;

public class VogalOuConsoante {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite uma letra:");
        char letra = tec.next().toLowerCase().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra " + letra + " é uma VOGAL.");
        } else if (letra >= 'a' && letra <= 'z') {
            System.out.println("A letra " + letra + " é uma CONSOANTE.");
        } else {
            System.out.println("Caractere inválido. Por favor, digite uma letra.");
        }
    }
}

