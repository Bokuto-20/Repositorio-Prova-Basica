
import java.util.Scanner;

public class VerificadorDeSenha {

    //Peçaa uma senha ao usuário e continue pedindo até que a senha correta ("java17") seja digitada.
    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);
        String senhaCorreta = "java17";
        String senhaInformada;

        do {
            System.out.println("Digite a senha: ");
            senhaInformada = tec.nextLine();

            if (!senhaInformada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senhaInformada.equals(senhaCorreta));

        System.out.println("Senha correta! Acesso concedido.");
        
    }
}
