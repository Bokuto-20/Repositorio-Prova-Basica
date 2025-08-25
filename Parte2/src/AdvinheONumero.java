import java.util.Scanner;

public class AdvinheONumero {

    public static void main(String[] args) {
        //Advinhação
        System.out.println("Advinhe o número entre 1 e 100!");
        

        int numeroSecreto = (int) (Math.random() * 100) + 1; 
        Scanner tec = new Scanner(System.in);
        int tentativa = 0;
        boolean acertou = false;
        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            tentativa = tec.nextInt();

            if (tentativa < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número: " + numeroSecreto);
                acertou = true;
            }
        }

    }
}
