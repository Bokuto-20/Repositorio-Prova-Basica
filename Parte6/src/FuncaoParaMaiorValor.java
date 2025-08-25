public class FuncaoParaMaiorValor {

    public static void main(String[] args) {
        double[] valores = {10.5, 20.0, 30.5, 40.0, 50.0};
        double maiorValor = encontrarMaiorValor(valores);
        System.out.println("O maior valor é: " + maiorValor);
    }

    public static double encontrarMaiorValor(double[] valores) {
        double maior = valores[0];
        for (double valor : valores) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }
}
