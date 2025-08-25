import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double num1 = tec.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = tec.nextDouble();
        System.out.println("Digite o operador (+, -, *, /):");
        char operador = tec.next().charAt(0);
        double resultado;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                System.out.println("Operador inválido!");
                break;
        }
    
    }
}

