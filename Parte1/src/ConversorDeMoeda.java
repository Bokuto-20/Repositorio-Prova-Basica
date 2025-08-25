import java.util.Scanner;

public class ConversorDeMoeda {

    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite o valor em reais (R$): ");
        double reais = tec.nextDouble();
        
      
        double cotacaoDolar = 5.45;
        
        double dolares = reais / cotacaoDolar;
        
        System.out.printf("O valor em dólares (US$) é: %.2f%n", dolares);
        
        
    }
}
