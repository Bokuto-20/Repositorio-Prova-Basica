public class FuncaoDeFatorial {

    public static void main(String[] args) {
        int numero = 5; // Exemplo de número para calcular o fatorial
        long fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

    public static long calcularFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número deve ser não negativo.");
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
