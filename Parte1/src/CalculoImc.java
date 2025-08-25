
import java.util.Scanner;

public class CalculoImc {

    public static void main(String[] args) {
        //Cálculo de IMC: Calcule o Índice de Massa Corporal (IMC = peso / altura²) e exiba a categoria (Abaixo do peso, Peso normal, Sobrepeso, etc.).
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite seu peso em kg: ");
        double peso = tec.nextDouble();
        
        System.out.println("Digite sua altura em metros: ");
        double altura = tec.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.printf("Seu IMC é: %.2f%n", imc);
    }
}
