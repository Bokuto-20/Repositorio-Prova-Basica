
import java.util.Scanner;

public class PositivoNegativoZero {

    //Positivo, Negativo ou Zero: Verifique se um número digitado é positivo, negativo ou zero.

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = tec.nextInt();

        if(numero >= 1){
            System.out.println("O número " + numero + " é positivo.");
        }else if(numero == 0){
            System.out.println("O número " + numero + " é zero.");
        }else{
            System.out.println("O número " + numero + " é negativo.");
        }
    }
}