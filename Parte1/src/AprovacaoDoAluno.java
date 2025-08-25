import java.util.Scanner;

public class AprovacaoDoAluno {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //Aprovação do Aluno: Calcule a média de duas notas e exiba "Aprovado" se a média for maior ou igual a 7.0, ou "Reprovado" caso contrário.

        System.out.println("Digite a primeira nota: ");
        double nota1 = tec.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = tec.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }
}