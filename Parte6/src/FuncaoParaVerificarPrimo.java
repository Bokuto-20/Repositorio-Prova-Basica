public class FuncaoParaVerificarPrimo {

    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se o número é divisível por qualquer número além de 1 e ele mesmo, não é primo
            }
        }
        return true; // Se não encontrou divisores, o número é primo
    }
}
