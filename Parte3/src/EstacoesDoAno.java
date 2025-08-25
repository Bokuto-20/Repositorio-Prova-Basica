import java.util.Scanner;

public class EstacoesDoAno {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o número do mês (1-12):");
        int mes = tec.nextInt();
        String estacao;
        switch (mes) {
            case 12:
            case 1:
            case 2:
                estacao = "Verão";
                break;
            case 3:
            case 4:
            case 5:
                estacao = "Outono";
                break;
            case 6:
            case 7:
            case 8:
                estacao = "Inverno";
                break;
            case 9:
            case 10:
            case 11:
                estacao = "Primavera";
                break;
            default:
                estacao = "Mês inválido";
                break;
        }
        System.out.println("O mês " + mes + " pertence à estação: " + estacao);
    }
}

