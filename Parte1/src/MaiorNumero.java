
import java.util.Scanner;

public class MaiorNumero {

    //Maior de Dois Números: Peça dois números e mostre qual deles é o maior.

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int numero1 = tec.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int numero2 = tec.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        }else{
            System.out.println("O maior número é: " + numero2);
        }
    }
}
