
import java.util.Scanner;

public class LoginSimples {

    public static void main(String[] args) {
        String usuario = "admin";
        String senha = "1234";
        
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite o usuário: ");
        String inputUsuario = tec.nextLine();
        
        System.out.println("Digite a senha: ");
        String inputSenha = tec.nextLine();
        
        if (inputUsuario.equals(usuario) && inputSenha.equals(senha)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
    }
}
