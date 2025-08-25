import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite um ano: ");
        int ano = tec.nextInt();
        
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        
        if (bissexto) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
}
