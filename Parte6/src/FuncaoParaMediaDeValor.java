public class FuncaoParaMediaDeValor {

    public static void main(String[] args) {
        double[] valores = {10.5, 20.0, 30.5, 40.0, 50.0};
        double media = calcularMedia(valores);
        System.out.println("A média dos valores é: " + media);
    }

    public static double calcularMedia(double[] valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }
}
