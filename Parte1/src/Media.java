
import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double a = tec.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double b = tec.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double c = tec.nextDouble();
        
        System.out.println("Digite a quarta nota: ");
        double d = tec.nextDouble();
        
        double media = (a + b + c + d) / 4;
        
        System.out.println("A média das notas é: " + media);
    }
}
