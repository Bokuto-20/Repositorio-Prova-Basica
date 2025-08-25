import java.util.Scanner;

public class Parte1 {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
    //   Soma Simples: Peça ao usuário para digitar dois números inteiros e exiba a soma deles.

    //    System.out.println("Escreva um número inteiro: ");
    //    int a = tec.nextInt();

    //    System.out.println("Escreva o segundo número inteiro: ");
    //    int b = tec.nextInt();

    //    int c = a + b;

    //Média de Notas: Peça quatro notas de um aluno e calcule a média.
        
        System.out.println("Digite a primeira nota:");
        double a = tec.nextDouble();

        System.out.println("Digite a primeira nota: ");
        double b = tec.nextDouble();

        System.out.println("Digite a primeira nota:");
        double c = tec.nextDouble();

        System.out.println("Digite a primeira nota: ");
        double d = tec.nextDouble();

        double e = (a+b+c+d)/4;

        System.out.println("A media das notas é: "+ e);


    }
}
