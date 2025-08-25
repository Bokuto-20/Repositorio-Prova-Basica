public class AdivinheONumero {

    public static void main(String[] args) {
        int numeroSecreto = 7; // Número que o usuário deve adivinhar
        int tentativa = 0; // Variável para armazenar a tentativa do usuário

        // Loop até que o usuário adivinhe o número
        while (tentativa != numeroSecreto) {
            System.out.print("Adivinhe o número (entre 1 e 10): ");
            tentativa = new java.util.Scanner(System.in).nextInt(); // Lê a tentativa do usuário

            if (tentativa < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número.");
            }
        }
    }
}
