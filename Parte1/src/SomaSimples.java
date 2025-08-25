
import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número inteiro: ");
        int a = tec.nextInt();
        
        System.out.println("Digite o segundo número inteiro: ");
        int b = tec.nextInt();
        
        int soma = a + b;
        
        System.out.println("A soma dos números é: " + soma);
        
        
    }   

}
